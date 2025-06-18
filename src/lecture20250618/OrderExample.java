package lecture20250618;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Order {
	private int quantity;
	private double price;
	private String currency;
	private Article article;
	public Order(int quantity, double price, Article article, String currency) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.currency = currency;
		this.article = article;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String toString() {
		return "Order [quantity=" + quantity + ", price=" + price + ", currency=" + currency + ", article=" + article
				+ "]";
	}
}

enum Article {
	TSHIRT1, TSHIRT2, SOCKS, WALLET;
}

public class OrderExample {
	public static void main(String[] args) {
		List<String> orders = Arrays.asList(
		        "TSHIRT1;3;10.00;EUR",
		        "TSHIRT2;4;15,00;EUR",
		        "SOCKS;1;7.00;EUR",
		        "WALLET;4;5.0;EUR",
		        "WALLET2;7;6.5;EUR",
		        "SOCKS;x;6.00;EUR"
		);
		
		List<Order> collect = orders.stream()
			.map(el -> el.split(";"))
			.map(el -> {
				try {					
					int quantity = Integer.parseInt(el[1]);
					double price = Double.parseDouble(el[2]);
					String currency = el[3];
					Article article = Article.valueOf(el[0]);
					return new Order(quantity, price, article, currency);
				} catch(IllegalArgumentException e) {
					return null;
				}
			})
			.filter(el -> el != null)
			.collect(Collectors.toList());
		collect.stream().forEach(System.out::println);
		

		
		orders.stream()
			.map(el -> el.split(";"))
			.filter(OrderExample::checkAll)
			.map(el -> new Order(
					Integer.parseInt(el[1]), 
					Double.parseDouble(el[2]), 
					Article.valueOf(el[0]), 
					el[3]))
			.filter(el -> el != null)
			.collect(Collectors.toList());
		collect.stream().forEach(System.out::println);
		
		
		
		
		// Ohne Lambda/ Stream-API 
		List<Order> result = new ArrayList<>();
		for(String s : orders) {
			String[] el = s.split(";");
			try {
				result.add(new Order(
					Integer.parseInt(el[1]), 
					Double.parseDouble(el[2]), 
					Article.valueOf(el[0]), 
					el[3]));
			} catch(IllegalArgumentException e) {
			}
		}
		
		
		List<Order> result2 = new ArrayList<>();
		for(String s : orders) {
			String[] el = s.split(";");
			if(checkAll(el)) {
				Order o = new Order(
					Integer.parseInt(el[1]), 
					Double.parseDouble(el[2]), 
					Article.valueOf(el[0]), 
					el[3]);
				result2.add(o);
			}
		}
	}
	
	public static boolean checkAll(String[] arr) {
		return isDouble(arr[2]) && isArticle(arr[0]);
	}
	
	public static boolean isDouble(String value) {
		try {					
			Double.parseDouble(value);
			return true;
		} catch(IllegalArgumentException e) {
			return false;
		}
	}
	
	public static boolean isArticle(String value) {
		try {					
			Article.valueOf(value);
			return true;
		} catch(IllegalArgumentException e) {
			return false;
		}
	}
}

package lecture20250415;

public class Greeting {
    public Greeting() { 
        System.out.print("Grüße an Unbekannt"); 
    }
    
    public Greeting(String name) { 
        System.out.print("Grüße an " + name); 
    }
    
    public Greeting(String prefix, String name) {
        System.out.print(prefix + " " + name);
    }
    
    public static void main(String[] args) {
    	Greeting g1 = new Greeting(); 
    	Person p3 = new Person("Willkommen", "Julia");
    	Employee e1 = new Employee(); // <--
    	Employee e2 = new Employee("Klaus");
    	Customer c1 = new Customer();
    	Customer c2 = new Customer("Sarah");
    	
    	System.out.println(g1.toString());
	}
}

class Person extends Greeting {
    public Person() { 
        super("Namenloser Besucher"); 
    }
    
    public Person(String name) { 
        super(name); 
    }
    
    public Person(String prefix, String name) {
        super(prefix, name);
    }
}
class Employee extends Person {
    public Employee() { 
    	super();
        System.out.print(", Mitarbeiter");
    }
    
    public Employee(String name) { 
        super("Werter Kollege", name); 
    }
}

class Customer extends Person {
    public Customer() {
        super();
        System.out.print(", Kunde");
    }
    
    public Customer(String name) {
        this();
        System.out.print(" " + name);
    }
}

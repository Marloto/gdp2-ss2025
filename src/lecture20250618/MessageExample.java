package lecture20250618;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Message {
    private long time;
    private String message;

    public Message(long time, String message) {
        this.time = time;
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public String toFormattedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY hh:mm:ss");
        return sdf.format(new Date(time));
    }

    public String toString() {
        return toFormattedTime() + ": " + message;
    }
}

public class MessageExample {
	private static long last = 0;
	public static void main(String[] args) {
		List<String> messages = Arrays.asList(
			    "1581697831661:Message 1",
			    "1581553746009:Message 2",
			    "1588854263313:Message 3",
			    "1589381962905:Message 4",
			    "1589379566771:Message 5");
		
		// 14.02.2020 05:30:31: Message 1
		// 07.05.2020 02:24:23: Message 3
		
		messages.stream()
		   .map(el -> el.split(":"))
		   .map(el -> new Message(Long.parseLong(el[0]), el[1]))
		   .filter((el) -> el.getTime() >= last)
		   .peek((el) -> last = el.getTime())
		   .forEach(System.out::println);
		
		// Übersetzen Sie die Stream-API-Vearbeitungslogik in eine Variante 
		// ohne Lambda-Ausdrücke und ohne Stream-API.
			
			
		for(String el : messages) {
			String[] split = el.split(":");
			Message msg = new Message(Long.parseLong(split[0]), split[1]);
			if(msg.getTime() >= last) {
				last = msg.getTime();
				System.out.println(msg);
			}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}

package lecture20250617;

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
	public static void main(String[] args) {
		List<String> messages = Arrays.asList(
			    "1581697831661:Message 1",
			    "1581553746009:Message 2",
			    "1588854263313:Message 3",
			    "1589381962905:Message 4",
			    "1589379566771:Message 5");
		
		// 14.02.2020 05:30:31: Message 1
		// 07.05.2020 02:24:23: Message 3
		
		// Vorschlag:
		// -> map: strings in messages mappen
		
		messages.stream()
			.map((el) -> {
				return null;
			});
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}

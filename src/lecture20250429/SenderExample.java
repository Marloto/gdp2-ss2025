package lecture20250429;

// Schnittstellen definieren
// -> Methoden definiert, müssen nicht public sein da sie immer public
//    (x) Rückgabedatentyp, (x) Parameterlisten, kein Method-Body (ja es geht in neueren Versionen mit einem default)
// -> Es gibt Attribute (Public, Static, Final, auch wenn nicht zwingend da)
// -> keine Konstruktoren
// -> gibt es sowas wie vererbung? ein interface kann mittels extends mehrere Schnittstellen erweitern
// Verwendung über implements in den entsprechenden Klassen
// -> namen der parameter spielen keine Rolle, die können sich ändern
interface A {
}

interface B {
}

interface IReceiver extends A, B {
	void dataChanged(String value);
}

interface Foo {
	void morething();
}

class Sender {
	private String data;
	private IReceiver[] receivers = new IReceiver[10];

	public void attach(IReceiver receiver) {
		for(int i = 0; i < receivers.length; i ++) {
			if(receivers[i] == null) {
				receivers[i] = receiver;
				break;
			}
		}
	}

	public void setData(String newData) {
		this.data = newData;
		for (int i = 0; i < receivers.length; ++i) {
			if (receivers[i] != null) {
				receivers[i].dataChanged(newData);
			}
		}
	}
}

class ChangeLogger implements IReceiver, Foo {
	public void dataChanged(String newData) {
		System.out.println("[ChangeLogger] New data: " + newData);
	}

	public void morething() {

	}
}

class MessageCounter implements IReceiver {
	private int noMsgs = 0;
	private int totalSize = 0;

	public void dataChanged(String newData) {
		noMsgs++;
		totalSize += newData.length();
		System.out.printf("[MessageCounter] #msgs=%d, total size=%d bytes%n", noMsgs, totalSize);
	}
}

public class SenderExample {


	public static void main(String[] args) {
		Sender sender = new Sender();
		
		sender.attach(new MessageCounter());
		sender.attach(new ChangeLogger());
		
		sender.setData("Hello, World");
		sender.setData("Hello, Universe");
	}
}

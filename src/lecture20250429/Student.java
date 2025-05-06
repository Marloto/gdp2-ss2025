package lecture20250429;

public class Student implements ISortable { // <- Zu sortierende Elemente
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {
        super();
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }
    
    public int getSortableAttribute() {
    	return this.matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public int getValue() {
        return this.matrikelnummer;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", matrikelnummer=" + matrikelnummer + "]";
    }

}

package lecture20250326;
public class Rechteck {
    int hoehe;
    int breite;
    
    Rechteck() {}

    Rechteck(int h, int b) {
      this.hoehe = h;
      this.breite = b;
    }
    
    void seitenLaengen(int h, int b) {
        hoehe = h;
        breite = b;
        Rechteck r3 = this;
        System.out.println(r3.hoehe);
    }
    
    public static void main(String[] args) {
        Rechteck r = new Rechteck(4, 3);
        Rechteck r2 = r;
        Rechteck r3 = new Rechteck();
        
        r.seitenLaengen(3, 2);
        r2.seitenLaengen(4, 4);
        r3.seitenLaengen(10, 10);
        
        System.out.println(r.breite + "/" + r.hoehe);
        System.out.println(r2.breite + "/" + r2.hoehe);
        System.out.println(r3.breite + "/" + r3.hoehe);
    }
}
package lecture20250513.compare;

public class Kreis implements GeometrischesObjekt {
    private double d;
    public Kreis(double d) {
        this.d = d;
    }
    public double getD() { return this.d; }
    public double berechneUmfang() {
        return Math.PI * this.d;
    }
}
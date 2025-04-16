package lecture20250415;

class A {
    private int var1 = 1;
    public boolean equals(Object obj) {
        A a = (A) obj;
        return a.var1 == this.var1;
    }
    
    public int getVar1() {
		return var1;
	}
}
class B extends A {
    private int var2 = 2;
    public boolean equals(Object obj) {
        B b = (B) obj;
        return b.var2 == this.var2 && super.equals(obj);
    }
}
class C extends B {
    private int var3 = 3;
    public boolean equals(Object obj) {
        C c = (C) obj;
        return c.var3 == this.var3 && super.equals(obj);
    }
}

public class AundB {
	public static void main(String[] args) {
		A v1 = new A();
		B v2 = new B();
		A v3 = v2;
		B v4 = new B();

		boolean result = v2.equals(v4);
	}
}

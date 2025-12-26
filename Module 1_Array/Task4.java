code
  class Multiplier {

    private int a;
    private int b;

    public Multiplier(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int multiply() {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Multiplier m = new Multiplier(2, 3);
        int result = m.multiply();

        System.out.println("Result: " + result);
    }
}

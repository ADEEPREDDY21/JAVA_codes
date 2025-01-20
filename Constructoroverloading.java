public class Constructoroverloading {
    int a, b, c, d, sum;

    public Constructoroverloading(int p, int q) {
        a = p;
        b = q;
        c = 0; // Initialize c to 0 for safety
        d = 0; // Initialize d to 0 for safety
        sum = a + b + c + d;
        System.out.println("Sum (2 arguments): " + sum);
    }

    public Constructoroverloading(int p, int q, int r) {
        a = p;
        b = q;
        c = r;
        d = 0; // Initialize d to 0 for safety
        sum = a + b + c + d;
        System.out.println("Sum (3 arguments): " + sum);
    }

    public static void main(String[] args) {
        Constructoroverloading obj1 = new Constructoroverloading(10, 20);
        Constructoroverloading obj2 = new Constructoroverloading(10, 20, 30);
    }
}

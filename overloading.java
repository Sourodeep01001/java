public class overloading {
    // compile time Polymorphism
    public static void main(String[] args) {
        a obj = new a();
        int add = obj.add();
        obj.add(100, 100);
        obj.add(100, 10.23);
        System.out.println("addition is= " + add);
    }
}

class a {
    int add() {// we can change also return type
        int a = 10;
        int b = 10;
        int c = a + b;
        return c;
    }

    void add(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }

    void add(int x, double y) {
        double c = x + y;
        System.out.println(c);
    }
}

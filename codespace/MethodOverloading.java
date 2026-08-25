class MethodOverloading {
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
    void add(int a, double b) {
        System.out.println("Sum of three integers: " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(10, 20);
        obj.add(10, 20.5);
        obj.add(10.5, 20.5);
    }
}
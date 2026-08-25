class AccessProtection{
    private int a = 10;
    int b = 20;            
    protected int c = 30;
    public int d = 40;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        AccessProtection obj = new AccessProtection();
        obj.display();
    }
}

\\
10
20
30
40
\\
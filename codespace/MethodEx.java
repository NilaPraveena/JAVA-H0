class MethodEx {
    public void display() {
        int count = 0, sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found number: " + i);
                sum += i;
                count++;
            }

            if (count == 5) {
                break;             }
        }

        System.out.println("Total Sum: " + sum);
    }

    public static void main(String args[]) {
        MethodEx numbers = new MethodEx();
        numbers.display();
    }
}
class consrtoverload2 {
    consrtoverload2() {
        System.out.println("Default constructor");
    }

    consrtoverload2(String name) {
        System.out.println("Name: " + name);
    }

    consrtoverload2(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        new consrtoverload2();
        new consrtoverload2("Praveena");
        new consrtoverload2("Praveena", 18);
    }
}
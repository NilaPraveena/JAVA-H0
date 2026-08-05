class main {
    private String name;
    private int marks;
    public String getname() {
        return name;
    }
    public int getmarks() {
        return marks;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setmarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
}
public class encaps {
    public static void main(String[] args) {
        main obj = new main();
        obj.setname("Praveena");
        obj.setmarks(85); 
        System.out.println("Name: " + obj.getname());
        System.out.println("Marks: " + obj.getmarks());
    }
}
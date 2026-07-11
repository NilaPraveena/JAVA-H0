public class student{
     String name;
     String rollno;
     public static void main(String args[]){
           student s1=new student();
           s1.name="praveena";
           s1.rollno="H0";
           student s2=new student();
           s2.name="nandini";
           s2.rollno="G6";
           student s3=new student();
           s3.name="spoorthi";
           s3.rollno="H5";
           s1.display();
           s2.display();
           s3.display();
     }
     void display(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println("________");
     }
}
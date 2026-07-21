class studentEx{
     String name;
     String rollno;
     public studentEx(){
            System.out.println("Iam default constructor");
     }
     public studentEx(String name,String rollno){
            this.name=name;
            this.rollno=rollno;
     }
     public static void main(String args[]){
            studentEx s1=new studentEx("Nandini","G6");
            studentEx s2=new studentEx("Spoorthi","H5");
            System.out.println(s1.name);
            System.out.println(s1.rollno);
            System.out.println(s2.name);
            System.out.println(s2.rollno);
     }
}

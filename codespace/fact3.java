import java.util.Scanner;
class fact3{
public int fact(int n){
if(n==0||n==1){
return 1;
}
else{
return n*fact(n-1);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
fact2 m=new fact2();
int sum = m.fact(n);
System.out.println("factorial:"+sum);
}
}
import java.util.Scanner;
class fact2{
static int fact(int n){
int sum=1;
for(int i=1;i<=n;i++){
sum *= i;
}
return sum;
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
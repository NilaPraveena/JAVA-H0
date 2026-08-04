import java.util.Scanner;
class Array2D{
public static void main(String arga[]){
int num[][]=new int[3][2];
Scanner sc=new Scanner(System.in);
for(int i=0;i<num.length;i++){
for(int j=0;j<num[i].length;j++){
num[i][j]=sc.nextInt();
}
}
System.out.println("Printing 2D array");
for(int[] val:num){
for(int value:val){
System.out.println(value+" ");
}
System.out.println();
}
}
}
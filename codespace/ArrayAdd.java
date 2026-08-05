import java.util.Scanner;
class ArrayAdd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows and columns:");
int r=sc.nextInt();
int c=sc.nextInt();
int[][]A=new int[r][c];
int[][]B=new int[r][c];
int[][]res=new int[r][c];
System.out.println("Enter matrix A:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter matrix B:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
B[i][j]=sc.nextInt();
}
}
System.out.println("Performing Addition:");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
res[i][j]=A[i][j]+B[i][j];
}
}
for(int[]val:res){
for(int v:val){
System.out.print(v + " ");
}
System.out.println();
}
sc.close();
}
}


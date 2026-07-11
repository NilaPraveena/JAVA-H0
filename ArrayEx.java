class ArrayEx{
    public static void main(String args[]){
        int[] myarray={10,43,78,23,90,124,245};
        int max=myarray[0];
        for(int i=1;i<myarray.length;i++){
            if(myarray[i]>max){
                 max=myarray[i];
            }
       }
       System.out.println(max);}
}
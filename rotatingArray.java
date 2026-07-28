public class rotatingArray {
    public static void main(String[] args){
     int A[]={1,2,3,4,5};
    for(int x:A){
        System.out.print(x+" ");
    }
    int temp=A[0];
    for(int i=1;i<A.length;i++){
        A[i-1]=A[i];
    }
    A[A.length-1]=temp;
    for(int x:A){
        System.out.println(x+" ");
    }
}
}

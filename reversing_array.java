public class reversing_array{
    public static void main(String []args){
        int A[]={1,2,3,4,5};
        int B[]=new int[A.length];
        for(int i=0,j=A.length-1;i<A.length && j>=0;i++,j--){
            B[i]=A[j];
        }
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }
    }
}
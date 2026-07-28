public class reverseMethodOverloading {
   static  int reverse(int n){
            int ans=0;
            while(n!=0){
                ans=ans*10+n%10;
                n=n/10;
            }
            return ans;
        }
       static int [] reverse(int n[]){
             int b[]=new int[n.length];
             for(int i=n.length-1,j=0;i>=0;i--,j++){
                b[i]=n[j];
             }

             return b;
        }
    public static void main(String [] args){
        int a[]={1,2,3,4,5};
        a=reverse(a);
        for(int x:a){
            System.out.println(x);
        }
       
    }
}

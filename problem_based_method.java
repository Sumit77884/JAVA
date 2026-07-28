public class problem_based_method {
    static boolean check(int n){
        for(int i=2;i*i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static int findGcd(int x,int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else if(y>x){
                y=y-x;
            }


        }
        return x;
    }
    public static void main(String [] args){
        int n=13,x=56,y=35;
        boolean ans=check(n);
        System.out.println(n+" IS PRIME:"+ans);
        int gcd=findGcd(x,y);
        System.out.println(gcd);
    }
}

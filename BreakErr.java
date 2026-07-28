public class BreakErr {
    public static void main(String args[]){
        one:for(int i=0;i<3;i++){
            System.out.print("Pass"+i+": ");
        }
        for(int j=0;j<1000;j++){
            if(j==10) break one;//This break will not run because one is not define for this loop.
            System.out.print(j+" ");

        }
    }
}

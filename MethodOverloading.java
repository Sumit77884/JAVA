public class MethodOverloading {
    static int max(int x,int y){
        return x>y?x:y;
    }
    static int max(int x,int y,int z){
        return x>y && x>z?x:(z>y?z:y);
    }
    public static void main(String [] args){
        System.out.println(max(10,15,25));
    }
}

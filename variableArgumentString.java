public class variableArgumentString {
    static void showList(String ...S){
        for(int i=0;i<S.length;i++){
            System.out.println(i+1+"."+S[i]);
        }
    }
    public static void main(String [] args){
   showList("John","Ajay","Ahmed");
    }
}

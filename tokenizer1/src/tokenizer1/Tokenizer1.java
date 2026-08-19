package tokenizer1;
import java.util.*;
import java.io.*;
public class Tokenizer1 {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //File path must be valid
        FileInputStream fis=new FileInputStream("");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        
    }
    
}

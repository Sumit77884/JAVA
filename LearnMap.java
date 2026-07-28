import java.util.HashMap;
import  java.util.Map; 
public  class LearnMap {
    public static void main(String[] args){
        Map<String,Integer>numbers =new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println(numbers);
        if(!numbers.containsKey("Two")){
            numbers.put("Two",23);
        }
            numbers.putIfAbsent("Two",23);
        
    }
    
}

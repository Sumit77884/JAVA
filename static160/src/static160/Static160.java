package static160;
import java.util.Date;
public class Static160 {
private String rollNo;
private static int count=1;
class Student{
     Date d=new Date();
    String rno = "Univ-"+(d,getYear()+1900)+"-"+count;
    count++;
    return rno;
}
Student(){
    rollNo=assignRollNo();
}
public String getRollNo(){
    return rollNo;
}
}
    
}
private String assignRollNo(){
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println(s1.getRollNo());
        
    }
    
}

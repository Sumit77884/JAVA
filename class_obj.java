class Student{
    int id;
    String name;
    void displayinfo(){
        System.out.println("ID:"+id+",Name: "+ name);
    }
}
public class class_obj {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.id=101;
        student1.name="Sumit";
        student1.displayinfo();
    }

    
}

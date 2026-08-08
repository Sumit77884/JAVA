package threadclass;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        
        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread t=new MyThread("My Thread 1");
        System.out.println("ID :"+t.getId());
        System.out.println("Name :"+t.getName());
        System.out.println("Priority :"+t.getPriority());
        t.start();
        t.interrupt();
        System.out.println("State :"+t.getState());
        System.out.println("Alive :"+t.isAlive());
    }
    
}


package runnablethread;

/*
public class RunnableThread implements Runnable {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        RunnableThread t=new RunnableThread();
        Thread th=new Thread(t);//This line extra in comprision to extend thread
        th.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
        
    }
    
}
*/ 
class ThreadTest implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class RunnableThread {
    public static void main(String [] args){
        ThreadTest th=new ThreadTest();
        Thread t=new Thread(th);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}

//Write a program which will create two threads and print the 10 numbers in sequence.

public class ThreadCount {

    synchronized public void count(){
        for(int i = 0; i<=9; i++){
            System.out.println(i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }
    }
}

class ThreadSynchronisation{
    public static void main(String[] args){
        final ThreadCount obj = new ThreadCount();//only one object

        Thread t1=new Thread(){
            public void run(){
                obj.count();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.count();
            }
        };

        t1.start();
        t2.start();
    }
}

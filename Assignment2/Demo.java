/*Write a program with Sender class which has a send method that
prints a message passed as a parameter. Then create a
class ThreadedSend which extends Thread class and
in constructor it accepts as message and Sender object.
Now write a demo class which will create two threads using the ThreadedSend class.
One thread will take the message as “Hi” and
another thread will take message input as “Bye”.
Now write a function which will print  “Hi” 1st and then “Bye”.*/

public class Demo {
    public static void main(String[] args){
        Sender s = new Sender();
        ThreadedSend obj1=new ThreadedSend("Hi",s);
        ThreadedSend obj2=new ThreadedSend("Bye",s);
        obj1.start();
        obj2.start();
    }
}

class Sender{
    synchronized public void send(String m){
        System.out.println(m);
        try{
            Thread.sleep(400);
        }catch(Exception e){System.out.println(e);}
    }
}

class ThreadedSend extends Thread{
    String m;
    Sender s;
    public ThreadedSend(String m, Sender s){
        this.m = m;
        this.s = s;
    }
    public void run(){
        s.send(m);
    }
}

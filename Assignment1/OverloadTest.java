//Write a class with method talk which prints hello and
//then overload the talk method by taking in a name and printing “Hello” with that name.
import java.io.*;

public class OverloadTest {

    String name;

    public String talk(){
        return "hello!";
    }

    public String talk(String name){
        this.name = name;
        return "Hello "+name;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OverloadTest o1 = new OverloadTest();
        System.out.println("Enter a name or not: ");
        String name = br.readLine();
        String greeting = o1.talk();
        System.out.println(greeting);
        greeting = o1.talk(name);
        System.out.println(greeting);
    }
}

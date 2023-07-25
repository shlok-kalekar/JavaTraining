//Write a class with method talk which prints hello and
//then overload the talk method by taking in a name and printing “Hello” with that name.
public class OverloadTest {

    String name;

    public String talk(){
        return "hello";
    }

    public String talk(String name){
        this.name = name;
        return "Hello "+name;
    }

    public static void main(String args[]){
        OverloadTest o1 = new OverloadTest();
        String greeting = o1.talk();
        greeting = o1.talk("Shlok");
        System.out.println(greeting);
    }
}

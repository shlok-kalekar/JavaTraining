//Write a class Person with private properties Name, Age and write the constructor to set these properties.
//Also write the setter and getter methods to set and get these properties.
public class Person {
    private String name;
    private int age;

    public Person(){
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String args[]){
        Person p1 = new Person("Shlok Kalekar", 22);
        String name_value1 = p1.getName();
        int age_value1 = p1.getAge();
        Person p2 = new Person();
        p2.setName("Utkarsh Srivastava");
        p2.setAge(21);
        String name_value2 = p2.getName();
        int age_value2 = p2.getAge();
        System.out.println("Name 1: "+name_value1+"\tAge: "+age_value1);
        System.out.println("Name 2: "+name_value2+"\tAge: "+age_value2);
    }
}

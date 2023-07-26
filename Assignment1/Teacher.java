/*Write class Teacher and Student which extends class Person.
Add properties Roll no, course, department in student class along with the constructor and getter, setters.
Add properties department, specialization in Teacher class along with constructor and getter, setters.
The constructor should accept all the properties of the person as well as the current class
i.e Student or Teacher and set the properties.*/
public class Teacher extends Person{
    private String department, specialisation;

    public Teacher(){
        super();
    }

    public Teacher(String name, int age, String department, String specialisation){
        super(name,age);
        this.department = department;
        this.specialisation = specialisation;
    }

    public String getDepartment(){
        return department;
    }

    public String getSpecialisation(){
        return specialisation;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setSpecialisation(String specialisation){
        this.specialisation = specialisation;
    }

    public static void main(String args[]){
        Teacher t1 = new Teacher("Vandana Abhyankar", 42, "Computers", "PhD");
        String name_value1 = t1.getName();
        int age_value1 = t1.getAge();
        String department_value1 = t1.getDepartment();
        String specialisation_value1 = t1.getSpecialisation();
        Teacher t2 = new Teacher();
        t2.setName("Subhashree Gupta");
        t2.setAge(35);
        t2.setDepartment("Economics");
        t2.setSpecialisation("B. ED");
        String name_value2 = t2.getName();
        int age_value2 = t2.getAge();
        String department_value2 = t2.getDepartment();
        String specialisation_value2 = t2.getSpecialisation();
        System.out.println("Name 1: "+name_value1+"\tAge: "+age_value1+
                "\tDepartment: "+department_value1+"\tSpecialisation: "+specialisation_value1);
        System.out.println("Name 2: "+name_value2+"\tAge: "+age_value2+
                "\tDepartment: "+department_value2+"\tSpecialisation: "+specialisation_value2);
    }
}

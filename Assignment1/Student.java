/*Write class Teacher and Student which extends class Person.
Add properties Roll no, course, department in student class along with the constructor and getter, setters.
Add properties department, specialization in Teacher class along with constructor and getter, setters.
The constructor should accept all the properties of the person as well as the current class
i.e Student or Teacher and set the properties.*/
public class Student extends Person{
    private int roll_no;
    private String course, department;

    public Student(){
        super();
    }

    public Student(String name, int age, int roll_no, String course, String department){
        super(name, age);
        this.roll_no = roll_no;
        this.course = course;
        this.department = department;

    }

    public int getRoll_no(){
        return roll_no;
    }

    public String getCourse(){
        return course;
    }

    public String getDepartment(){
        return department;
    }

    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public static void main(String args[]){
        Student s1 = new Student("Shlok Kalekar", 22, 2, "HPC", "Computers");
        String name_value1 = s1.getName();
        int age_value1 = s1.getAge();
        int rollNo_value1 = s1.getRoll_no();
        String course_value1 = s1.getName();
        String department_value1 = s1.getDepartment();
        Student s2 = new Student();
        s2.setName("Utkarsh Srivastava");
        s2.setAge(21);
        s2.setRoll_no(4);
        s2.setCourse("FinTech");
        s2.setDepartment("Finance");
        String name_value2 = s2.getName();
        int age_value2 = s2.getAge();
        int rollNo_value2 = s2.getRoll_no();
        String course_value2 = s2.getName();
        String department_value2 = s2.getDepartment();
        System.out.println("Name 1: "+name_value1+"\tAge: "+age_value1+"\tRoll No: "+rollNo_value1+
                "\tCourse: "+course_value1+"\tDepartment: "+department_value1);
        System.out.println("Name 2: "+name_value2+"\tAge: "+age_value2+"\tRoll No: "+rollNo_value2+
                "\tCourse: "+course_value2+"\tDepartment: "+department_value2);
    }
}
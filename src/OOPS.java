
class Pen{
    String color;
    String type; // ballpoint or gel;
    public void write(){
        System.out.println("writing something ");
    }
    public void printcolor(){
        System.out.println(this.color );
    }

    public void penType(){
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age );
    }
    Student(Student s2){
//        System.out.println("Student()  Constructor called");
        this.name=name;
        this.age=age;
    }
    Student(){

    }
}
public class OOPS {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printcolor();
        pen2.printcolor();

        pen1.penType();
        pen2.penType();

        Student s1= new Student();
        s1.name = "ayush";
        s1.age = 21;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

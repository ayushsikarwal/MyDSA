import java.util.*;
import java.lang.*;

class Person {
    int id;
    String name;
    int age;
    List<Person> children;
    // int date;
    // int month;
    // int year;

    public void printInfo() {
        System.out.println(this.name+"'s age is: "+this.age+" and id is: "+this.id);
        System.out.println("childrens of "+ this.name +" is: "+ getChildrenName());
    }

    public String getChildrenName() {
        String names = new String();
        if(this.children == null) {
            return names;
        }

        for(Person child : this.children) {
            names += child.name + ", ";
        }

        return names;
    }

    public void addChildren(Person person) {
        if (this.children == null) {
            this.children = new LinkedList();
        }
        this.children.add(person);
    }
}

public class Classes {
    public static void main(String[] args) {
        System.out.println("LOLOL");
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        Person person4 = new Person();

        person1.id = 1;
        person1.name = "Ayush";
        person1.age = 18;

        person2.id = 2;
        person2.name = "Piyush";
        person2.age = 19;

        person3.id = 3;
        person3.name = "Surbhi";
        person3.age = 20;

        person4.id = 4;
        person4.name = "Ram Prasad";
        person4.age = 50;

        person4.addChildren(person1);
        person4.addChildren(person2);
        person4.addChildren(person3);

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();

        person4.printInfo();
    }
}
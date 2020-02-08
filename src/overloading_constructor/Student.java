package overloading_constructor;

import org.launchcode.Teacher;

public class Student {
    String name, gender;
    int id;

    Student(String name, String gender, int id){
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    Student(){
        System.out.println("This is default constructor");
    }

    Student(String name){
        this.name = name;
    }

    Student(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Student id: " + id);
    }
}

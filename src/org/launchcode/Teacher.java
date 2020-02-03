package org.launchcode;

/* It,s a simple class to understand how class and object work */
public class Teacher {
    String name;
    String gender;
    int age;

    void setInfo(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

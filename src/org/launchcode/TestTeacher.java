package org.launchcode;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Parvej";
        t1.gender = "Male";
        t1.age = 26;
        t1.display();

        Teacher t2 = new Teacher();
        t2.name = "max";
        t2.gender  = "male";
        t2.age = 35;

        t2.display();
        t1.display();
    }
}

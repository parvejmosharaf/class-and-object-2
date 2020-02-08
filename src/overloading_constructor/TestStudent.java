/*This is a program about constructor
overloading */
package overloading_constructor;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInfo();

        Student student2 = new Student("Pax", "male", 25);
        student2.displayInfo();

        Student student3 = new Student("Parvej");
        student3.displayInfo();

        Student student4 = new Student("pax" ,  "male");
        student4.displayInfo();
    }
}

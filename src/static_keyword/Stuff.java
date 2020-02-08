package static_keyword;

public class Stuff {
    String name;
    int id;
    static String orgName = "HDU";

    Stuff(String name, int id){
        this.name = name;
        this.id = id;
    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Id: " +id);
        System.out.println("Org Name: " + orgName);
    }

}

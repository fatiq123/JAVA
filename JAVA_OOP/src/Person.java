// Getter Setter in Java Class -> OOP

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; }


    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static void main(String[] args) {        // main method
        Person p = new Person();
        p.setName("Fatiq");
        System.out.println("Person's name is " + p.getName());
        p.setAge(20);
        System.out.println("Person's age is " + p.getAge());
        p.setAddress("Muridke");
        System.out.println("Person's address is " + p.getAddress());

    }

}

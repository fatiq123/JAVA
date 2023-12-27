package Interface;

public class Employee implements PersonInfo{
    @Override
    public String personName() {
        return "Fatiq Hussnain";
    }

    @Override
    public int personAge() {
        return 20;
    }

    @Override
    public String address() {
        String ad = "Muridke";
        return ad;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.personName());
        System.out.println(e.personAge());
        System.out.println(e.address());
    }
}



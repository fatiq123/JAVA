public class JavaClass {

    String name;
    int age;

    public JavaClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }

    @Override
    public String toString() {
        return ("Hi my name is " + this.name + " and my age is " + this.age);
    }

    public static void main(String[] args) {
        JavaClass jc = new JavaClass("Fatiq", 20);
        System.out.println(jc);
    }
}

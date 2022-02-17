public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();

        Person person2 = new Person("Khrisna");

        Person person3;
        person3 = new Person("Muhammad", "Bandung");

        person1.name = "Avtara";
        person1.address = "Purwokerto";
        // person1.country = "America";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Joko");
    }
}

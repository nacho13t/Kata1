package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Nacho", new Date(94,3,13));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}

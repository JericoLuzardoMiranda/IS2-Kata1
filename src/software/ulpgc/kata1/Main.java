package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jericó", LocalDate.of(2000, 11, 21));
        System.out.println(person.getAge());
    }
}

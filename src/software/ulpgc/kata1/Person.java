package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {

    private final String person;
    private final LocalDate birthday;

    public Person(String person, LocalDate birthday) {
        this.person = person;
        this.birthday = birthday;
    }

    public String getPerson() {
        return person;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay()-birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365.25);
    }

}

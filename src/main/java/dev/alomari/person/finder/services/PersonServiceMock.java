package dev.alomari.person.finder.services;

import dev.alomari.person.finder.beans.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Profile("mocking")
public class PersonServiceMock implements PersonService {

    private static List<Person> personList;

    static {
        personList = new ArrayList<>();

        personList.add(new Person(1L, "Abdulmajeed", 22));
        personList.add(new Person(2L, "Yousef", 35));
        personList.add(new Person(3L, "Ahmad", 17));
}

    @Override
    public Person findPerson(Long id) {

        for (Person person : personList) {
            if(person.getId() == id) {
                return person;
            }
        }

        return null;
    }


}

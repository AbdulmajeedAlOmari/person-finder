package dev.alomari.person.finder.services;

import dev.alomari.person.finder.beans.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
//@Profile("prod")
public class PersonServiceImpl implements PersonService {

    @Override
    public Person findPerson(Long name) {
        throw new IllegalStateException("SERVICE NOT WOKING");
    }
}

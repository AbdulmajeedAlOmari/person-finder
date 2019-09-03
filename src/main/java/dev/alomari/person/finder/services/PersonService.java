package dev.alomari.person.finder.services;

import dev.alomari.person.finder.beans.Person;

public interface PersonService {

    Person findPerson(Long name);
}

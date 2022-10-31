/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.HashMap;

/**
 *
 * @author TT
 */
public class PersonDirectory {
    
    private HashMap<Integer, Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new HashMap<Integer, Person>();
    }
    
    public void addPerson(Person person) {
        personDirectory.put(person.getId(), person);
    }
    public void addPerson(int id, int age, String firstName, String lastName, int residenceId, int communityId, String position){
        Person person = new Person(id, age, firstName, lastName, residenceId, communityId, position);
        personDirectory.put(person.getId(), person);
    }
    public void updatePerson(Person person){
        personDirectory.remove(person.getId());
        personDirectory.put(person.getId(), person);
    }
    public void deletePerson(Person person) {
        personDirectory.remove(person.getId());
    }
    public void deletePerson(Integer personId) {
        personDirectory.remove(personId);
    }

    public HashMap<Integer, Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(HashMap<Integer, Person> persontDirectory) {
        this.personDirectory = personDirectory;
    }
    
}

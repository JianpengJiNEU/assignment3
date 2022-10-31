/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

/**
 *
 * @author TT
 */
public class Person {

    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private int residenceId;
    private int communityId;
    private String position;
    private String telephone;
    private String email;

    public Person(int id, int age, String firstName, String lastName, int residenceId, int communityId, String position) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.residenceId = residenceId;
        this.communityId = communityId;
        this.position = position;
    }
    
    public Person(int id, int age, String firstName, String lastName, int residenceId, int communityId) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.residenceId = residenceId;
        this.communityId = communityId;
    }


    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(int residenceId) {
        this.residenceId = residenceId;
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}

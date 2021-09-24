package com.iamshashiraj.learn.model;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private boolean isAlive;

    public boolean isAlive() {
        return isAlive;
    }

    public Person(String firstName, String lastName, int age, int salary, boolean isAlive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isAlive = isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}

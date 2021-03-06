package javasyntax.subclasses;

public class Person {

    private String name, birthDay;

    public Person(String personName, String personBirthDay) {
        name = personName;
        birthDay = personBirthDay;
    }

    public void printInfo() {
        System.out.println("I am a " + name + " and I was born on " +  birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}

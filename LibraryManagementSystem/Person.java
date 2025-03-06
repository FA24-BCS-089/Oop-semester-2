package LibraryManagementSystem;

public class Person {

    private String name;
    private int age;
    private String gender;
    private Address officeAddress;

    public Person(String name, int age, String gender, Address officeAddress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.officeAddress = new Address(officeAddress);
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
        this.officeAddress = new Address(other.officeAddress);
    }

    public void show() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Gender: " + gender);
        System.out.print("  Office Address: ");
        officeAddress.show();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && gender.equals(person.gender) && officeAddress.equals(person.officeAddress);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }
}

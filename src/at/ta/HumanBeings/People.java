package at.ta.HumanBeings;

public class People {
    private String firstName;
    private String lastName;
    private double size;
    private int age;
    private double weight;

    public People(String name, String lastName, double size, int age, double weight) {
        this.firstName = name;
        this.lastName = lastName;
        this.size = size;
        this.age = age;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void printBaseDataPerson() {
        System.out.println();
        System.out.println("Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Size: " + getSize());
        System.out.println("Weight: " + getWeight());

    }

    public void printName() {
        System.out.println();
        System.out.println("Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println();
    }

}

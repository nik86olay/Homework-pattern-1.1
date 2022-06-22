package person;

public class PersonBuilder {
    private String name;
    private String surname;
    private String address;
    private int age;

    public PersonBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(final String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(final int age) throws IllegalArgumentException {
        if (age <= 0 || age > 140) throw new IllegalArgumentException("указан некорректный возраст");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Person build() {
        if (PersonBuilder.this.name == null || PersonBuilder.this.surname == null)
            throw new IllegalStateException("не заполнены основные поля");
        return new Person(this);
    }
}

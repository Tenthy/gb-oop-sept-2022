package ru.kmetha.oop.homework1.task1;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName; //optional
    private String country; //optional
    private String address; //optional
    private String phone;
    private int age; //optional
    private String gender; //optional

    public Person(PersonBuilder personBuilder) {
        firstName = personBuilder.firstName;
        lastName = personBuilder.lastName;
        middleName = personBuilder.middleName;
        country = personBuilder.country;
        address = personBuilder.address;
        phone = personBuilder.phone;
        age = personBuilder.age;
        gender = personBuilder.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName; //optional
        private String country; //optional
        private String address; //optional
        private String phone;
        private int age; //optional
        private String gender; //optional

        public PersonBuilder(String firstName, String lastName, String phone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phone = phone;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

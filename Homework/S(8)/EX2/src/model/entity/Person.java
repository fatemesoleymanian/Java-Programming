package model.entity;

public class Person {
    String user_name,password,email,gender;

    public String getUser_name() {
        return user_name;
    }

    public Person setUser_name(String user_name) {
        this.user_name = user_name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Person setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }
}

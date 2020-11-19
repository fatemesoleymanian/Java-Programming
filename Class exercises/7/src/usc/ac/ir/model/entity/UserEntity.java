package usc.ac.ir.model.entity;

public class UserEntity {
    private String user_name,name,email;
    private long password;

    public String getUser_name() {
        return user_name;
    }

    public UserEntity setUser_name(String user_name) {
        this.user_name = user_name;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public long getPassword() {
        return password;
    }

    public UserEntity setPassword(long password) {
        this.password = password;
        return this;
    }
}

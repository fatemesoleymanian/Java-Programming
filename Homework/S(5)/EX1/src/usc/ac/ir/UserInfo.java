package usc.ac.ir;

public class UserInfo {
    private String userName;
    private String userRealName;
    private String password;
    private int age;
    private String address;
    private long phoneNumber;
    private String education;

    public String getUserName() {
        return userName;
    }

    public UserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public UserInfo setUserRealName(String userRealName) {
        this.userRealName = userRealName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserInfo setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserInfo setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserInfo setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public UserInfo setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public UserInfo setEducation(String education) {
        this.education = education;
        return this;
    }
}

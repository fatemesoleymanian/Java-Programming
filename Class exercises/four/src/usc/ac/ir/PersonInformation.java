package usc.ac.ir;

public class PersonInformation {
    private String name;
    private String family;
    private int age;
    private String job;
    private String username;
    private double password;

    PersonInformation(){

            System.out.println("plz enter your information .");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getUsername() {
        return username;
    }

    public double getPassword() {
        return password;
    }
}

package usc.ac.ir.model.enyity;

public class Customerentity {
    private String password,name,carSituation,car,color;
    private  int nationalCode;
    private float cost;

    public String getColor() {
        return color;
    }

    public Customerentity setColor(String color) {
        this.color = color;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customerentity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customerentity setName(String name) {
        this.name = name;
        return this;
    }

    public float getCost() {
        return cost;
    }

    public Customerentity setCost(float cost) {
        this.cost = cost;
        return this;
    }

    public String getCarSituation() {
        return carSituation;
    }

    public Customerentity setCarSituation(String carSituation) {
        this.carSituation = carSituation;
        return this;
    }

    public String getCar() {
        return car;
    }

    public Customerentity setCar(String car) {
        this.car = car;
        return this;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public Customerentity setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }
}

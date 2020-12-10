package remote;

import java.io.Serializable;

public class People implements Serializable {
    String address,cost,food;

    public People(){}

    public People(String address,String cost,String food){
        this.address=address;
        this.cost=cost;
        this.food=food;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

package usc.ac.ir.model.entity;

public class CustomerEntity {
    private String user_name ,local_traffic;
    private long password,bill;

    public String getUser_name() {
        return user_name;
    }

    public CustomerEntity setUser_name(String user_name) {
        this.user_name = user_name;
        return this;
    }

    public String getLocal_traffic() {
        return local_traffic;
    }

    public CustomerEntity setLocal_traffic(String local_traffic) {
        this.local_traffic = local_traffic;
        return this;
    }

    public long getPassword() {
        return password;
    }

    public CustomerEntity setPassword(long password) {
        this.password = password;
        return this;
    }

    public long getBill() {
        return bill;
    }

    public CustomerEntity setBill(long bill) {
        this.bill = bill;
        return this;
    }
}

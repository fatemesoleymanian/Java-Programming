package src.BankRemote;

import java.io.Serializable;

public class Client implements Serializable {
    String accNum,password;

    public String getAccNum() {
        return accNum;
    }

    public Client setAccNum(String accNum) {
        this.accNum = accNum;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Client setPassword(String password) {
        this.password = password;
        return this;
    }


}

package OOPS.Encapsulation.PrivateType;

class account {
    private String password;

    // geter
    public String getPassword() {
        return this.password;
    }

    // seter
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Mod {
    public static void main(String[] args) {
        account ac = new account();
        ac.setPassword("Baby");
        System.out.println(ac.getPassword());
    }
}

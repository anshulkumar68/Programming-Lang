package oops;
class Bank
{
    public String name;
    protected String email;
    private String password;

    //Getter and Setter
    public String getPass(){
        return this.password;
    }

    public void setPass(String pass){
        this.password = pass;
    }
}
class Modifier {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.name = "GetLost";
        b1.email = "getlost@gmail.com";
        b1.setPass("abcd");
        System.out.println(b1.getPass());
    }
}

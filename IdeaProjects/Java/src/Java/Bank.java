package Java;
class Data {
    String name;
    String accno;
    double balance;

    public Data (String name, String accno, float balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    void deposit(double ammount) {
        balance+=ammount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not sufficient BALANCE");
        }
    }


    void Displayinfo () {
        System.out.println("Name: "+name+" | Account Number: "+accno+" | Balance: "+balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        Data p1 = new Data("Tanvir", "0112430534", 1000000);
        Data p2 = new Data("Aisf", "0112430127", 2000000);
//        p1.Displayinfo();
//        p2.Displayinfo();
        p1.deposit(485287.343);
        p2.deposit(576857.4322);
        p1.Displayinfo();
        p2.Displayinfo();
        p1.withdraw(1000100);
        p2.withdraw(25768570.5);
        p1.Displayinfo();
        p2.Displayinfo();

    }
}

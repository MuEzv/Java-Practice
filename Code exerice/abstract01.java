public class abstract01 {

    public static void main(String[] args) {
        Bank bank1 = new testBank();
        bank1.getRateOfInteret();
    }
}

abstract class Bank {
    abstract void getRateOfInteret();
}

class testBank extends Bank {
    void getRateOfInteret() {
        System.out.println("0.5%");
    }
}
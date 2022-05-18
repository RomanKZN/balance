public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1000;
        int total;

        if (amount >= 1001) {
           total = 1 * amount / 100 + (amount + balance);
        } else {
            total = amount + balance;
        }

        System.out.println(total);


    }
}

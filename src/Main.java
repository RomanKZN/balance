public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int amount = 1500;
        int bonus = 1 * amount / 100 + (amount + balance);


        if (amount >= 1000) {
            bonus = 1 * amount / 100 + (amount + balance);
        } else {
            bonus = amount + balance;
        }

        System.out.println(bonus);


    }
}

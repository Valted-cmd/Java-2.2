public class Main {
    public static void main(String[] args) {
        int myWallet = 100;
        int deposit = 1001;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        }
        else {
            bonus = 0;
        }
        int balance = myWallet + deposit + bonus;

        System.out.println("Твой бонус: " + bonus + " руб.");
        System.out.println("Итоговый счет: " + balance + " руб.");
    }
}

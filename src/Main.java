public class Main {
    public static void main(String[] args) {
        int myWallet = 100;
        int deposit = 1100;
        int bonus = deposit / 100;
        int balance = myWallet + deposit + bonus;
        if (deposit >= 1000) {
            bonus = deposit / 100;
        }
        else {
            bonus = 0;
        }
        System.out.println("Твой бонус: " + bonus + " руб.");
        System.out.println("Итоговый счет: " + balance + " руб.");
    }
}

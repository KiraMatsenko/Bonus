public class Main {

    public static void main(String[] args) {

        int amount = 1200; // сумма пополнения
        int openingBalance = 100; // начальный счёт

        int bonus; // бонус за каждые 100 рублей пополнения
        if (amount > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int finalBalance = amount / 100 * bonus + openingBalance + amount; // итоговый счёт

        System.out.println(finalBalance);
    }
}
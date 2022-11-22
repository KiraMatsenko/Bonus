public class Main {

    public static void main(String[] args) {

        int amount = 1200; // сумма пополнения
        int initialAccount = 100; // начальный счёт

        int bonus = 0; // бонус за каждые 100 рублей пополнения
        if (amount > 1000) {
            bonus = amount / 100;
        }

        int finalAccount = initialAccount + amount + bonus; // итоговый счёт

        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }
}
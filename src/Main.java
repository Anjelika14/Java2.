public class Main {

    public static void main(String[] args) {
        int amount = 300; // Первоначальная сумма
        int summa = 1600; // Сумма пополнения

        if (summa <= 1000) {
            System.out.println("Вы пополнили счёт на " +  summa + " руб.");
            System.out.println((amount + summa) + " Итоговая сумма");
            System.out.println((0) + " Количество бонусных рублей");
        } else {
            int bonus = (summa / 100); // Бонус при пополнении
            System.out.println("Вы пополнили счёт на " +  summa + " руб.");
            System.out.println((amount + summa + bonus) + " Итоговая сумма");
            System.out.println((bonus) + " Количество бонусных рублей");
        }

    }
}
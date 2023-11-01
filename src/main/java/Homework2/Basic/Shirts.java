package Homework2.Basic;

public class Shirts {
    public static void main(String[] args) {
        int costShirt = 500;
        int piercesShirts = 2;
        int piercesForDiscount = 3;

        int piercesToDiscountNeed = piercesForDiscount - piercesShirts; //целочисленная переменная,
        // в которой количество рубашек, которые надо добавить к купленным, чтобы получить скидку.
        System.out.println(piercesToDiscountNeed);

        int costOfShirtsWithoutDiscount = costShirt * piercesShirts; //целочисленную переменная,
        // в которой общая цена уже выбранных рубашек без скидки
        System.out.println(costOfShirtsWithoutDiscount);

        int costOfAllPiercesShirts = costShirt * (piercesForDiscount - piercesShirts); //целочисленная переменная,
        // в которой общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку.
        System.out.println(costOfAllPiercesShirts);

        double percentDiscount = 0.5;

        double costOFAllShirtsWithDiscount = (piercesForDiscount * costShirt) * percentDiscount; //дробная переменная,
        // в которой цена всех рубашек со скидкой
        System.out.println(costOFAllShirtsWithDiscount);

        double costOneShirtWithDiscount = (piercesForDiscount * costShirt) * percentDiscount / piercesForDiscount; //дробная переменная,
        // в которой цена одной рубашки со скидкой
        System.out.println(costOneShirtWithDiscount);

        double economyOfMoney = (piercesForDiscount * costShirt) - costOFAllShirtsWithDiscount; //дробная переменная,
        // в которой количество сэкономленных денег, если рубашки куплены со скидкой
        System.out.println(economyOfMoney);

        double freeShirt = (economyOfMoney * piercesForDiscount) / (piercesForDiscount * costShirt); //дробная переменная,
        // в которой количество рубашек, которые из-за скидки считай получены на халяву
        System.out.println(freeShirt);
    }
}

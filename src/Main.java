public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var a = 1;
        if (a >= 0) ;
        System.out.println("число положительное");
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var x = 1;
        var y = 3;
        var resultat = x + y;
        System.out.println("x+y=" + resultat);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("еще можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("общий вес фруктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("место осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("перегруз место осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("перегруз на " + overload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("продуктов в одной машине теперь " + productsInOneCar);



    }

}
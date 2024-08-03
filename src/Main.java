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


        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789.0;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog + 4.0;
        cat = cat + 4.0;
        paper = paper + 4.0;
        System.out.println("dog" + dog);
        System.out.println("cat" + cat);
        System.out.println("paper" + paper);


        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639.0;
        System.out.println("dog" + dog);
        System.out.println("cat" + cat);
        System.out.println("paper" + paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10.0;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var sum = fighter1 + fighter2;
        System.out.println("fighter1 + fighter2=" + sum);
        var difference = fighter2 - fighter1;
        System.out.println("difference=" + (fighter2 - fighter1));
        var procent = fighter2 / fighter1;
        System.out.println("procent=" + (fighter2 % fighter1));


        var f = 640;
        System.out.println(f);
        var d = 8;
        System.out.println(d);
        var z = f / d;
        System.out.println(" всего работников в компании  " + z);
        var j = 80;
        System.out.println(j);
        var k = 80 + 94;
        System.out.println("пополнение" + k);
        var m = f / k;
        System.out.println("если" + k + "то" + m);

















    }
}

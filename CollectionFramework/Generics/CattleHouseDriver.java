package CollectionFramework.Generics;

import OOPS.Laptop;

public class CattleHouseDriver {
    public static void main(String[] args) {
        CattleHouse ch1 = new CattleHouse();
        //way1 to add
        Animal a1 = new Animal();
        ch1.addAnimal(a1);
        ch1.addAnimal(new Dog());
        ch1.addAnimal(new Cat());

        System.out.println("============");
        //currently it can check any type
        ch1.checkObject(a1);
        ch1.checkObject(new Dog());
        ch1.checkObject(new Cat());
        ch1.checkObject(new Laptop());
        ch1.checkObject(12); //object of new Integer
        ch1.checkObject(34.5);

        System.out.println("===================");
        //now, it can only check animal type
        ch1.feedAnimal(new Dog());
        ch1.feedAnimal(new Cat());
        ch1.feedAnimal(new Animal());
        ch1.feedAnimal(new Cow());

    }
}

package CollectionFramework.Generics;

public class CattleHouse {
    public void addAnimal(Animal a){
        System.out.println("Animal is Added.");
    }

    //currently, it can check any type of object because it's a generics type method.
    public <T>  void checkObject(T t) {
        System.out.println("Object is being checked.");
    }

    // now it's only allowed for animal type using extends.
    public<T extends Animal> void feedAnimal(T t) {
        System.out.println("Animal is being feed.");
    }
}

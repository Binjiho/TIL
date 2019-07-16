package chap07.abstraction;

abstract class Pet {
    public abstract void makeNoise(); //¼ø¼ö°¡»óÇÔ¼ö
}

class Duck extends Pet {
    public void makeNoise() {
        System.out.println("²Ð²Ð!");
    }
}

class Cat extends Pet {
    public void makeNoise() {
        System.out.println("¾ß¿Ë~");
    }
}

class Dog extends Pet {
    public void makeNoise() {
        System.out.println("¸Û~¸Û!");
    }
}

public class PetShop {
    public static void main(String[] args) {
        Pet[] myPets = new Pet[4];
        myPets[0] = new Dog();
        myPets[1] = new Duck();
        myPets[2] = new Cat();
        myPets[3] = new Dog();
        for (int index = 0; index < myPets.length; index++) {
            myPets[index].makeNoise();
        }
    }
}

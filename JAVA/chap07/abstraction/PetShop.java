package chap07.abstraction;

abstract class Pet {
    public abstract void makeNoise(); //���������Լ�
}

class Duck extends Pet {
    public void makeNoise() {
        System.out.println("�в�!");
    }
}

class Cat extends Pet {
    public void makeNoise() {
        System.out.println("�߿�~");
    }
}

class Dog extends Pet {
    public void makeNoise() {
        System.out.println("��~��!");
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

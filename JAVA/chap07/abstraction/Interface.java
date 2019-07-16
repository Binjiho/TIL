package chap07.abstraction;

interface Pet {
//	public static final variables
	int imsi =100;    //public static final int imsi = 100;  
	
//	public abstract methods
    void makeNoise(); //public abstract void makeNoise(); //¼ø¼ö°¡»óÇÔ¼ö
}

class Duck implements Pet {
    public void makeNoise() {
        System.out.println("²Ð²Ð!");
    }
}

class Cat implements Pet {
    public void makeNoise() {
        System.out.println("¾ß¿Ë~");
    }
}

class Dog implements Pet {
    public void makeNoise() {
        System.out.println("¸Û~¸Û!");
    }
}

public class Interface {
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

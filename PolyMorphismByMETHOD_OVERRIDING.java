public class PolyMorphismByMETHOD_OVERRIDING {
    public static void main(String[] args) {
        Animal_2 myDog = new Dog_2();
        Animal_2 myCat = new Cat_2();

        myDog.makeSound();  // Output: Dog barks
        myCat.makeSound();  // Output: Cat meows
    }
}
class Animal_2 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog_2 extends Animal_2 {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat_2 extends Animal_2 {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();  // Output: This animal eats food.
        puppy.bark(); // Output: The dog barks.
        puppy.weep(); // Output: The puppy weeps.
    }
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}


public class Single_Inheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat();  // Output: This animal eats food.
        dog.bark(); // Output: The dog barks.
    }
}
class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}


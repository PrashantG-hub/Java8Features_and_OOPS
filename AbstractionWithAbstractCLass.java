public class AbstractionWithAbstractCLass {
    public static void main(String[] args) {
        Car car = new Car();
        car.makeSound(); // Output: Bark
        car.run(); // Output: This animal is eating.
    }
}

abstract class vehicle {
    // Abstract method
    abstract void makeSound();

    // Regular method
    void run() {
        System.out.println("This Vehicle is running.");
    }
}

// Subclass
class Car extends vehicle {
    @Override
    void makeSound() {
        System.out.println("Car Blows Horn");
    }
}

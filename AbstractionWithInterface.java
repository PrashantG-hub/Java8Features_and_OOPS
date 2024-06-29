public class AbstractionWithInterface {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.makeSound(); // Output: Bark
        bus.run(); // Output: This animal is eating.
    }
}
interface Automobile {
    void makeSound();
    void run();
}

// Class implementing the interface
class Bus implements Automobile {
    @Override
    public void makeSound() {
        System.out.println("Bus Blows Horn");
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }
}


public class PolymorphismByMETHOD_OVERLOADING {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println(number);
    }

    public void print(double number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        PolymorphismByMETHOD_OVERLOADING printer = new PolymorphismByMETHOD_OVERLOADING();
        printer.print("Hello, World!");  // Output: Hello, World!
        printer.print(123);             // Output: 123
        printer.print(3.14);            // Output: 3.14
    }
}

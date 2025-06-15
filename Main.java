public class Main {
    public static void main(String[] args) {
        Pen myPen = new Pen("Purple");
        System.out.println("Welcome to CS 112!");
        Main.printMessage();
        System.out.println("My pen is " + myPen);
        System.out.println(Main.multiplyNumbers(37, 85));
    }

    public static void printMessage() {
        System.out.println("I like to code!");
    }

    public static int multiplyNumbers (int number1, int number2) {
        int result = 0;
        result = number1 * number2;
        return result;
    }
}
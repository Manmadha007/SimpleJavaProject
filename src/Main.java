public class Main {

    // Method to add two numbers
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int result = main.sum(5, 3);
        System.out.println("Sum is: " + result);
    }
}

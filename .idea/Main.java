package Lessons;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input");
        Scanner console = new Scanner(System.in);
        System.out.println(calc(console.nextLine()));
    }

    public static String calc(String input){

        int result;
        int a = 0;
        int c = 0;

        String[] symbol = input.split(" ");
        if (symbol.length != 3) {
           throw new IllegalArgumentException("throws Exception");

        }
        try {
            a = Integer.parseInt(symbol[0]);
            c = Integer.parseInt(symbol[2]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат");
        }

        if (a < 1 || a > 10 || c < 1 || c > 10) {
             throw new IllegalArgumentException("от 1 до 10 включительно");
        }

        if (symbol[1].equals("+")) {
            System.out.println("Output");
            result = a + c;
        } else if (symbol[1].equals("-")) {
            System.out.println("Output");
            result = a - c;
        } else if (symbol[1].equals("*")) {
            System.out.println("Output");
            result = a * c;
        } else if (symbol[1].equals("/")) {
            System.out.println("Output");
            result = a / c;
        } else {
            throw new IllegalStateException("throws Exception");
        }
        return String.valueOf(result);
    }
}

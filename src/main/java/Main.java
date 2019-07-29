import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        System.out.println("enter numbers, q-quit");
       try(Scanner scanner = new Scanner(System.in)) {
           String input;
           while (!(input = scanner.next()).equals("q") ) {
               System.out.println(fizzBuzzConverter.convert(Integer.parseInt(input)));
           }
       }
       catch (NumberFormatException none) {
           System.out.println("bad input");
       }
    }
}

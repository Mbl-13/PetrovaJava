import java.util.Scanner;
class Main {

public static void main() {
    Scanner in = new Scanner(System.in);
    System.out.print("Input a string 1: ");
    String firstString = in.nextLine();
    System.out.print("Input a string 2: ");
    String secondString = in.nextLine();

    if (firstString.equals(secondString)) {
        System.out.println("Строки идентичны");
    } else {
        System.out.println("Строки неидентичны");
    }
    in.close();
}
}
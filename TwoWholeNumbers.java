import java.util.Scanner;
class Main {

public static void main() {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number 'a': ");
    int num_a = in.nextInt();
    System.out.print("Input a number 'b': ");
    int num_b = in.nextInt();

    System.out.printf("Your number: %d , %d \n", num_a, num_b);
      
    System.out.println(num_a+num_b);
    System.out.println(num_a-num_b);
    System.out.println(num_a*num_b);
    if (num_b == 0) {
        System.out.println("Error: Division by zero");
    } else {
        System.out.println(num_a / num_b);
    }
    if (num_a > num_b) {
        System.out.println("a > b");
    } else if (num_a < num_b) {
        System.out.println("a < b");
    } else {
        System.out.println("a = b");
    }
    in.close();
}
}
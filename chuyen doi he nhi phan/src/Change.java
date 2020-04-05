import java.util.Scanner;
import java.util.Stack;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so nguyen can chuyen doi");
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        while (number != 0) {
            stack.push(number % 2);
            number = (number / 2);
        }
        while (stack.empty() == false) {
            System.out.print(stack.pop());

        }

    }


}

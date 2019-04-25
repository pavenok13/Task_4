import java.util.Scanner;

public class Task_4 {
    static int a, count = 0, des = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите бинарное число:");
        int Task_4Input  = scan.nextInt();
        System.out.println("Соответствует десятичному числу:" + Task_4(Task_4Input, count));
    }

    public static int Task_4(int number, int count) {
        if (number > 0) {
            a = number % 10;
            number = number / 10;
            des = des + a * (int) Math.pow(2, count);
            return Task_4(number, ++count);
        }
        return des;

    }
}

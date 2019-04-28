import java.util.Scanner;
public class Task_7 {
    static int a=13, b=5, c=34;
    public static void main(String[] args) {
        System.out.println("Введите число :");
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        if (T==a || T==b || T==c) {
            System.out.println("Данное значение имеется в константах:");
             } else {
                System.out.println("Такой константы нет:");
             }
        }
    }


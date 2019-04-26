import java.util.Scanner;
public class Task_6 {
    void srednee(int a, int b, int c) {
        int srednee = (a + b + c) / 3;
        System.out.println("Среднее арифметическое = " + srednee);
        if (srednee / 2 > 3) {
            System.out.println("Программа выполнена корректно ");
        }
    }

    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);
        Task_6 srednee = new Task_6();
        int a,b,c;
        System.out.println("Введите первое число");
        a = sc.nextInt();
        System.out.println("Введите второе число");
        b = sc.nextInt();
        System.out.println("Введите третье число");
        c = sc.nextInt();
        srednee.srednee(a,b,c);
    }
}
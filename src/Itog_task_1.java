import java.util.Scanner;

public class Itog_task_1 {
    static int top, stop = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите бинарное число:");
        int Itog_task_1_Input  = scan.nextInt();
        System.out.println("Соответствует десятичному числу:" + Itog_task_1(Itog_task_1_Input, 0));
    }

    public static int Itog_task_1(int num, int count) {
        while (num > 0) {
            top = num % 10 ;
            num = num / 10;
            stop = stop + top * (int) Math.pow(2, count);
            return Itog_task_1(num, ++count);
        }
        return stop;
}
}


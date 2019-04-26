import java.util.Scanner;
public class Task_7 {
    static int X=7, Y=13, Z=2;
    public static void main(String[] args){
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        if (T == X){
            System.out.println("Данное значение имеется в константах:"); }
        else if (T == Y){
            System.out.println("Данное значение имеется в константах:"); }
        else if (T == Z){
            System.out.println("Данное значение имеется в константах:"); }
        else   {
            System.out.println("Такой константы нет:");
        }
    }
}

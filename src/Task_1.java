import java.util.Scanner;

public class Task_1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Введите1 двоичное число:");
        String bin = sc.nextLine ();
        int binNum = Integer.parseInt (bin, 2);
        System.out.println (binNum);
    }
}

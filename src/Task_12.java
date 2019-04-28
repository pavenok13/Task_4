import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введитке строку с пробелами;");
        String a = sc.nextLine();
        a = a.replaceAll("\\s","");
        System.out.println("Строка без пробелов;" + a);
    }
}
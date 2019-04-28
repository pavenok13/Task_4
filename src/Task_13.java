import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку;");
        String sc1 = sc.nextLine();
        Scanner sca = new Scanner(System.in);
        System.out.println("Введитке вторую строку;");
        String sc2 = sca.nextLine();
        int length1 = sc1.length();
        int length2 = sc2.length();
        if (length1 > length2) {
            System.out.println("Строка с наибольшей длиной;" + sc1);
        } else  {
            System.out.println("Строка с наибольшей длиной;" + sc2);
        }

    }
}

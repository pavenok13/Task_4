import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] * 2);
        }
        System.out.println();
    }
}
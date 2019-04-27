import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер 1  массива: ");
        int size = in.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер 2  массива: ");
        int pize = sc.nextInt();
        int array[][] = new int[size][pize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                array[i][j] = in.nextInt();
            }
            in.close();

            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[0][j] * 3 + "\t");
            }
        }
        {
        }
    }
}
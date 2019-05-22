import java.util.*;
public class Itog_task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int p = in.nextInt();
        int sop[] = new int[p];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < p; i++) {
            sop[i] = in.nextInt();
        }
            int cast;
            do {
                cast = 0;
                for (int i = 0; i < sop.length - 1; i++) {
                    if (sop[i] > sop[i + 1]) {
                        int j = sop[i];
                        sop[i] = sop[i + 1];
                        sop[i + 1] = j;
                        cast++;
                    }
                }
            } while (cast > 0);
            System.out.println("min до max" + Arrays.toString(sop));
        }
    }
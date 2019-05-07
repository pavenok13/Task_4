import java.util.Arrays;

public class Task_15 {
    public static void main (String[] args) {
        int [] sandArray = {3, 45, 23,56,21,1,5};
        stap(sandArray);
    }
    public static void stap ( int [] arraystaff){
        int cast ;
        do {
             cast = 0;
            for (int num = 0; num < arraystaff.length - 1; num++) {
                if (arraystaff[num] > arraystaff[num + 1]) {
                    int tur = arraystaff[num];
                    arraystaff[num] = arraystaff[num + 1];
                    arraystaff[num + 1] = tur;
                    cast++;
                }
            }
        } while (cast > 0);
        System.out.println(Arrays.toString(arraystaff));
    }
}


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Itog_task_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество рублей: ");
            double r = in.nextDouble();
            System.out.println("Введите текущий курс :");
            double k = in.nextDouble();
            double d = convert (r, k);
            double itogo =  new BigDecimal(d) . setScale ( 2 , RoundingMode. UP ) . doubleValue ();
            System.out.println("Получим в доллорах:"+ itogo);
        }
    private static double convert(double r, double k) {
            return r/k;
    }
}

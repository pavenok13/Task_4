import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_16 {
    public static void main(String[] args) {
        String st;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Андрей\\Desktop\\text.txt"))) {
            while ((st = br.readLine()) != null) {
                System.out.println(st); }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
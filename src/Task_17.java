import java.io.*;

public class Task_17 {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для того, чтобы окончить ввод - напишите: 'stop' ");
        try (FileWriter fw = new FileWriter("C:\\Users\\Андрей\\Desktop\\text3.txt")) {
            do {
                System.out.print("Введите текст: ");
                s = br.readLine();
                if (s.compareTo("stop") == 0)
                    break;
                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("stop") != 0);
        }catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        System.out.println("Файл записан");
    }
}

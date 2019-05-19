import java.io.*;

public class Task_18 {
    public  static  void  main ( String [] args ) {
        String  s;
        int count =  0 ;
        try ( BufferedReader br =  new  BufferedReader ( new FileReader("C:\\Users\\Андрей\\Desktop\\text.txt"))) {
            while ((s = br.readLine()) != null) {
                System .out. println(s);
                count ++ ; }
        } catch ( IOException exc) {
            System.out.println ( " Ошибка ввода-вывода: "  + exc); }
        BufferedReader br =  new  BufferedReader ( new InputStreamReader( System.in ));
        if (count==0){
            System.out.println ( "Файл пуст, вводить ничего не надо ");
        }
        else {
        try ( FileWriter fw =  new  FileWriter ("C:\\Users\\Андрей\\Desktop\\text.txt")) {
            do {
                System.out.print ( " Введите текст: " );
                s = br . readLine();
                s = s +  "\r\n" ;
                fw . write (s);
                count -- ;
            } while (count !=  0 );
        } catch ( IOException exc) {
            System.out.println ( " Ошибка ввода-вывода: "  + exc); }
        System.out.println ( " Файл записан " ); }}}

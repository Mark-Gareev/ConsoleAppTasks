package Tasks;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task {
     String a1;
     String b1;
     String c1;
     String result = "";
     Task(){}

    public Task(String a, String b, String c){
        a1 = a;
        b1 = b;
        c1 = c;
    }//Чтение строк напрямую(пока не используется)
    public Task(File file) throws IOException//Задание пути для чтения входного файла в строки
    {
            Scanner scan = new Scanner(file);
            a1 = scan.nextLine();
            b1 = scan.nextLine();
            c1 = scan.nextLine();
            scan.close();
    }
    public void imper() //Выполнение любой задачи
    {

    }
}

package Tasks;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public abstract class Task { // Абстракный класс для стандартизации выполнения задач в FileWork и Main
    public String a1;
    public String b1;
    public String c1;
    public String result = "";
    public Task(){}

    public Task(String a, String b, String c){
        a1 = a;
        b1 = b;
        c1 = c;
    }//Чтение строк напрямую(пока не используется)
    public Task(String f_path) throws IOException //Задание пути для чтения входного файла в строки
    {
        try {
            File file = new File(f_path);
            Scanner scan = new Scanner(file);
            a1 = scan.nextLine();
            b1 = scan.nextLine();
            c1 = scan.nextLine();
            scan.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void imper() throws IOException//Выполнение любой задачи
    {
        try{

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

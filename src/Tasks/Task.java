package Tasks;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public abstract class Task {
    public String a1;
    public String b1;
    public String c1;
    public Task(){}

    public Task(String a, String b, String c){
        a1 = a;
        b1 = b;
        c1 = c;
    }
    public Task(String f_path) throws IOException
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
    public void imper() throws IOException
    {
        try{

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    private String result;
}

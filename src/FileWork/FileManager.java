package FileWork;

import Tasks.*;

import java.io.File;
import java.io.IOException;

public class FileManager {
    private Task task;
    private File Task1 = new File("Resources/InpTask1.txt");
    private File Task2 = new File("Resources/InpTask2.txt");
    private File Task3 = new File("Resources/InpTask3.txt");
    private File Task4 = new File("Resources/InpTask4.txt");
    private File Task5 = new File("Resources/InpTask5.txt");





    public void Linker(String command) throws IOException
    {
        task = null;
        if(command.equals("Task1"))
        {
            System.out.println(Task1.getAbsolutePath());
            task = new TaskCaesarDecoder(Task1);
            //TaskCaesarDecoder task = new TaskCaesarDecoder(Task1.getPath());
        }
        if(command.equals("Task2"))
        {
            task = new TaskAreaBetweenFunction(Task2);
            //System.out.println("There is no prod yet");
        }
        if(command.equals("Task3"))
        {
            task = new TaskSimpleMath(Task3);
        }
        if(command.equals("Task4"))
        {
            task = new TaskToCamelNotation(Task4);
        }
        if(command.equals("Task5"))
        {
            task = new TaskMorzeEncoder(Task5);
        }
    }
    public void Executor() throws IOException
    {
        try {
            task.imper();
            task = null;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

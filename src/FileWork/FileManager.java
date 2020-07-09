package FileWork;

import Tasks.Task;
import Tasks.TaskAreaBetweenFunction;
import Tasks.TaskCaesarDecoder;
import java.io.File;
import java.io.IOException;

public class FileManager {
    private File Task1 = new File("Resources/InpTask1.txt");
    private Task task;
    private File Task2 = new File("Resources/InpTask2.txt");





    public void Linker(String command) throws IOException
    {
        task = null;
        if(command.equals("Task1"))
        {
            System.out.println(Task1.getAbsolutePath());
            task = new TaskCaesarDecoder(Task1.getPath());
            //TaskCaesarDecoder task = new TaskCaesarDecoder(Task1.getPath());
        }
        if(command.equals("Task2"))
        {
            task = new TaskAreaBetweenFunction(Task2.getPath());
            //System.out.println("There is no prod yet");
        }
    }
    public void Executor() throws IOException
    {
        try {
            task.imper();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

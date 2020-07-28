package FileWork;

import Tasks.*;

import java.io.File;
import java.io.IOException;

public class TaskProducer {
    private Task task;
    private File Task1 = new File("Resources/InpTask1.txt");
    private File Task2 = new File("Resources/InpTask2.txt");
    private File Task3 = new File("Resources/InpTask3.txt");
    private File Task4 = new File("Resources/InpTask4.txt");
    private File Task5 = new File("Resources/InpTask5.txt");
    private File Task6 = new File("Resources/InpTask6.txt");
    private File Task7 = new File("Resources/InpTask7.txt");





    public void Linker(String command) throws IOException, IncorrectInputExсeption
    {
        if(command.equals("Task1"))
        {
            System.out.println(Task1.getAbsolutePath());
            task = new TaskCaesarDecoder(Task1);
            //TaskCaesarDecoder task = new TaskCaesarDecoder(Task1.getPath());
        }
        else {
            if (command.equals("Task2")) {
                task = new TaskAreaBetweenFunction(Task2);
                //System.out.println("There is no prod yet");
            }
            else {
                if (command.equals("Task3")) {
                    task = new TaskSimpleMath(Task3);
                }
                else {
                    if (command.equals("Task4")) {
                        task = new TaskToCamelNotation(Task4);
                    }
                    else {
                        if (command.equals("Task5")) {
                            task = new TaskMorzeEncoder(Task5);
                        }
                        else
                        {
                            if(command.equals("Task6")) {
                                task = new TaskMorzeDecoder(Task6);
                            }
                            else {
                                if (command.equals("Task7"))
                                    task = new TaskGraphAlgorithms(Task7);
                                else{
                                        throw new IncorrectInputExсeption("Wrong command to execute");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public void Executor()
    {

            task.imper();
            task = null;
    }

}

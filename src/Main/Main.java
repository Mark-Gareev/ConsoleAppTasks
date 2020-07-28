package Main;

import FileWork.TaskProducer;
import FileWork.IncorrectInputExсeption;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void run() throws IOException, IncorrectInputExсeption
    {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        TaskProducer core = new TaskProducer();
        System.out.println("Use \"Task№\" form");
        System.out.println("---------------------------");
        System.out.println("Task1 - Caesar Decoder");
        System.out.println("---------------------------");
        System.out.println("Task2 - Area between function");
        System.out.println("---------------------------");
        System.out.println("Task3 - Simple Math");
        System.out.println("---------------------------");
        System.out.println("Task4 - ToCamelNotation");
        System.out.println("---------------------------");
        System.out.println("Task5 - Morze Encoder");
        System.out.println("---------------------------");
        System.out.println("Task6 - Morze Dncoder");
        System.out.println("---------------------------");
        System.out.println("Task7 - GraphAlgorithms");
        System.out.println("Press \"e\" to exit");
        System.out.println("Your command?");
        while (true) {
            command = scanner.nextLine();

            if (command.equals("e")) {
                scanner.close();
                break;
            }
            core.Linker(command);
            core.Executor();
            command = "";
            System.gc();
            System.out.println("---------------------------");
            System.out.println("---------TASK DONE---------");
            System.out.println("---------------------------");
            System.out.println("Your command?");
        }

        System.out.println("Goodbye!");
    }
    public static void main(String[] args)
    {
        while(true) {
            try
            {
                run();
                break;
            }
            catch (Exception e)
            {
                e.getMessage();
                e.printStackTrace();
                System.out.println("There was something wrong :(");
                System.out.println("After all, would you try it again? \r\n Y|N");
                Scanner scan = new Scanner(System.in);
                String r = scan.next();
                if(r.equals("Y"))
                {
                    System.gc();
                    continue;
                }
                else
                {
                    System.out.println("So, be happy :)");
                    break;
                }
            }
        }
    }
}

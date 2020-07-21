package Main;

import FileWork.FileManager;
import FileWork.IncorrectInputExсeption;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void run() throws IOException, IncorrectInputExсeption
    {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        FileManager core = new FileManager();
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
        System.out.println("Press \"e\" to exit");
        System.out.println("Your command?");
        while (true) {
            command = scanner.nextLine();
            System.out.println("there is command : " + command);
            if (command.equals("e")) {
                break;
            }
            core.Linker(command);
            core.Executor();
            command = "";
            System.out.println("---------------------------");
            System.out.println("---------------------------");
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
                System.out.println("After all, would you try it again? \r\n Y|N");
                Scanner scan = new Scanner(System.in);
                String r = scan.next();
                if(r.equals("Y"))
                    continue;
                else
                    System.out.println("So, be happy :)");
                    break;
            }
        }
    }
}

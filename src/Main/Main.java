package Main;

import FileWork.FileManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
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
        System.out.println("Press \"e\" to exit");
        System.out.println("Your command?");
        while(true)
        {
            command = scanner.nextLine();
            System.out.println("there is command : "+ command);
            if(command.equals("e"))
            {
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
}

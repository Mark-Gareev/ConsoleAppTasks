package Main;

import FileWork.FileManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String command;
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Greetings for you, user! Please, choose Task to be shown. Use \"Task№\"");
            while(true)
            {
                System.out.println("Available : Caesar Decoder -- Task1 || Area between functions -- Task2");
                command = scan.nextLine();
                FileManager Manager = new FileManager();
                Manager.Linker(command);
                Manager.Executor();
                System.out.println("There is how it Works:)");
                System.out.println("Press e to exit, press another key to continue:");
                String flag = scan.next();
                if(flag.equals("e"))
                {
                    scan.close();
                    System.out.println("Goodbye!");
                    break;
                }
                else {
                    Manager = null;
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

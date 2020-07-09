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

            System.out.println("Available : \n\r Caesar Decoder -- Task1 \n\r Area between functions -- Task2 \n\r Simple Math -- Task3 \n\r ToCamelNotation -- Task4");
            command = scan.nextLine();
            FileManager Manager = new FileManager();
            Manager.Linker(command);
            Manager.Executor();
            System.out.println("There is how it Works:)");

            System.out.println("Goodbye!");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

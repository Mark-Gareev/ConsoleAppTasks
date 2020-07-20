package Tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskToCamelNotation extends Task{
    public TaskToCamelNotation(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        a1 = scan.nextLine();
    }
    private String castString(String a)//Превращение входной строки в строку НужногоФормата
    {
        String res = "";
        String [] innerstrings = a1.split("_");
        if(innerstrings.length == 1)
            innerstrings = a1.split("-");
        if(innerstrings.length == 1)
            innerstrings = a1.split(" ");
        for(int i = 0; i < innerstrings.length; i++) //Поделил слово на две части, потом их склеил в нужном формате
        {
            String end = innerstrings[i].substring(1,innerstrings[i].length());
            String begin = String.valueOf(innerstrings[i].charAt(0));
            begin = begin.toUpperCase();
            res+=begin;
            res+=end;
        }
        return res;
    }
    @Override
    public void imper()
    {
        System.out.println(castString(a1));
    }
}

package Tasks;

import DataStructures.Graph;
import FileWork.IncorrectInputExсeption;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskGraphAlgorithms extends Task
{
    Graph graph = new Graph();
    public TaskGraphAlgorithms(File file)throws IOException {
        Scanner scan = new Scanner(file);
        a1 = scan.nextLine();
        b1 = scan.nextLine();
        scan.close();

        scan = new Scanner(a1);
        while (scan.hasNext())
            graph.addVertex(Integer.parseInt(scan.next()));
        scan.close();

        scan = new Scanner(b1);
        while (scan.hasNext())
        {
            int first = Integer.parseInt(scan.next());
            int second = Integer.parseInt(scan.next());
            graph.addEdge(first,second);
        }
    }
    @Override
    public void imper() {
        System.out.println(graph.getLinkList());
    }
}

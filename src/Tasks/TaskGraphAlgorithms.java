package Tasks;

import DataStructures.UndirectedGraph;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class TaskGraphAlgorithms extends Task
{
    private UndirectedGraph undirectedGraph = new UndirectedGraph();
    private HashMap<Integer,Boolean> visited = new HashMap<>();
    private ArrayList<Integer> way = new ArrayList<>();
    private boolean flag = false;
    private int a = 0,b = 0;


    public TaskGraphAlgorithms(File file)throws IOException {
        Scanner scan = new Scanner(file);
        a1 = scan.nextLine();
        b1 = scan.nextLine();
        scan.close();

        scan = new Scanner(a1);
        while (scan.hasNext())
            undirectedGraph.addVertex(Integer.parseInt(scan.next()));
        scan.close();

        scan = new Scanner(b1);
        while (scan.hasNext())
        {
            int first = Integer.parseInt(scan.next());
            int second = Integer.parseInt(scan.next());
            undirectedGraph.addEdge(first,second);
        }
        scan.close();
    }
    @Override
    public void imper(){
        try {
            //System.out.println("Put first vertex");
            Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.println("Avaliable: \r\n FindAnyChain \r\n To exit press \"e\"");
                String command = scanner.nextLine();
                if(command.equals("FindAnyChain"))
                {
                    System.out.println("Put two vertexes : ");
                    String q = scanner.nextLine();
                    scanner = new Scanner(q);
                    a = Integer.parseInt(scanner.next());

                    b = Integer.parseInt(scanner.next());
                    FindAnyChain();
                    scanner = new Scanner(System.in);
                }
                if(command.equals("e"))
                    break;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private void setVisited()
    {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        map = undirectedGraph.getLinkList();
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet())
        {
            visited.put(entry.getKey(), false);
        }

    }
    private   void DepthFirstSearch(int in, int out)
    {
        if(in == out)
        {
            flag = true;
            way.add(in);
        }
        List<Integer> toGo = undirectedGraph.getlinks(in);
        visited.put(in, true);
        if((in != out)&&(!flag))
        {

            for(int i = 0; i < toGo.size(); i++) {
                if(visited.get(toGo.get(i)))
                    continue;
                //System.out.println("We can go to : " + toGo.get(i));
                DepthFirstSearch(toGo.get(i), out);
                if ((flag)&&!(way.contains(in)))
                    way.add(in);
                //System.out.println("Reset. go to previous probability. In is : " + in);
            }
        }

    }
    private void FindAnyChain()
    {
        setVisited();
        DepthFirstSearch(a,b);
        if(flag) {
            Collections.reverse(way);
            System.out.println("Result is : ");                //Алгоритм ищет первую попавшуюся простую цепь между вершинами
            System.out.println(way);
        }
        else{
            System.out.println("There is no way");
        }
    }

}

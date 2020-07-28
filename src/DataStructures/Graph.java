package DataStructures;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
//Представление графа -- список связности...........//
//Граф неориентированный............................//
//Список вершин сротируется для ускорение поиска....//
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
public class Graph {
        HashMap<Integer, List<Integer>> linkList = new HashMap<>();
        public void addVertex(int index)
        {
            if(!hasVertex(index))
            {
                linkList.put(index, new ArrayList<Integer>());
            }
        }
        public boolean hasVertex(int index) {
            return linkList.containsKey(index);
        }
        public boolean hasEdge(int index1, int index2)
        {
            if(!hasVertex(index1))
                return false;
            else
            {
                List<Integer> edges = linkList.get(index1);
                return Collections.binarySearch(edges, index2) != -1;
            }
        }
        public void addEdge(int index1,int index2)
        {
            if(!hasVertex(index1))
                addVertex(index1);
            if(!hasVertex(index2))
                addVertex(index2);
            List<Integer> edges1 = linkList.get(index1);
            List<Integer> edges2 = linkList.get(index2);
            edges1.add(index2);
            edges2.add(index1);
            Collections.sort(edges1);
            Collections.sort(edges2);
            linkList.put(index1,edges1);
            linkList.put(index2,edges2);
        }

    public HashMap<Integer, List<Integer>> getLinkList() {
        return linkList;
    }
}


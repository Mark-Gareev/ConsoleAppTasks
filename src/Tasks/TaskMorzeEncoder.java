package Tasks;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TaskMorzeEncoder extends Task {
    ArrayList<String> words = new ArrayList<>();
    public TaskMorzeEncoder(File file) throws IOException
    {
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            words.add(scan.next());
            System.out.println(words);
            System.out.println("------------------------");
        }
        scan.close();
    }
    private static Map<String, String> CreateMap()
    {
        Map<String,String> map = new HashMap<>();
        map.put("а","01");
        map.put("б","1000");
        map.put("в","011");
        map.put("г","110");
        map.put("д","100");
        map.put("е","0");
        map.put("ж","0001");
        map.put("з","1100");
        map.put("и","00");
        map.put("й","0111");
        map.put("к","101");
        map.put("л","0100");
        map.put("м","11");
        map.put("н","10");
        map.put("о","111");
        map.put("п","0110");
        map.put("р","010");
        map.put("с","000");
        map.put("т","1");
        map.put("у","001");
        map.put("ф","0010");
        map.put("х","0000");
        map.put("ц","1010");
        map.put("ч","1110");
        map.put("ш","1111");
        map.put("щ","1101");
        map.put("ы","1011");
        map.put("ъ","1001");
        map.put("ь","1001");
        map.put("э","00100");
        map.put("ю","0011");
        map.put("я","0101");
        return map;

    }
    private static String Encode(ArrayList<String> a, Map<String, String> map )
    {
        String res = "";
        String k = "";
        for(int i = 0; i < a.size(); i++)
        {
            k = a.get(i);
            for(int j = 0; j < k.length(); j++ )
            {
                res += map.get(String.valueOf(k.charAt(j)));
                res+="|";
            }
            res+="||";
        }
        return res;
    }
    @Override
    public void imper(){
        System.out.println(Encode(words, CreateMap()));
    }

}

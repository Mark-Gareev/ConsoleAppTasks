package Tasks;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaskMorzeEncoder extends Task {
    private ArrayList<String> words = new ArrayList<>();
    public TaskMorzeEncoder(File file) throws IOException
    {
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            words.add(scan.next());
        }
        scan.close();
    }
    private static Map<String, String> CreateMap()
    {
        Map<String,String> map = new HashMap<>();
        map.put("а","10111");
        map.put("б","111010101");
        map.put("в","1001110111");
        map.put("г","111011101");
        map.put("д","1110101");
        map.put("е","1");
        map.put("ж","101010111");
        map.put("з","11101110101");
        map.put("и","101");
        map.put("й","1011101110111");
        map.put("к","111010111");
        map.put("л","101110101");
        map.put("м","1110111");
        map.put("н","11101");
        map.put("о","11101110111");
        map.put("п","10111011101");
        map.put("р","1011101");
        map.put("с","10101");
        map.put("т","111");
        map.put("у","1010111");
        map.put("ф","101011101");
        map.put("х","1010101");
        map.put("ц","11101011101");
        map.put("ч","1110111011101");
        map.put("ш","111011101110111");
        map.put("щ","1110111010111");
        map.put("ы","1110101110111");
        map.put("ъ","11101010111");
        map.put("ь","11101010111");
        map.put("э","10101110101");
        map.put("ю","10101110111");
        map.put("я","10111010111");
        return map;

    }
//     1 - короткий сигнал, 111 -- длинный сигнал 0 - разделитель сигнала
//        000 - разделитель букв, 0000000 - разделитель слов

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
                if(j < k.length() - 1)
                    res+="000";
            }
            if(i < a.size()-1)
                res+="0000000";
        }
        return res;
    }
    @Override
    public void imper(){
        try {
            result = Encode(words, CreateMap());
            System.out.println(result);
            System.out.println("Do you want port your result to InpTask6(Morze Decoder) ? \r\n Y|N");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equals("Y")) {
                File file = new File("Resources/InpTask6.txt");
                FileWriter writ = new FileWriter(file,false);
                writ.write(result);
                writ.flush();
                writ.close();
            }
            result = null;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}

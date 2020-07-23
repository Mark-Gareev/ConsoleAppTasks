package Tasks;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaskMorzeDecoder extends Task {
    static private String result = "";
    static private Pattern lettersplit = Pattern.compile("000");
    static private Pattern wordsplit = Pattern.compile("0000000");
    static private Map map = CreateMap();

    public TaskMorzeDecoder(File file) throws IOException
    {
        Scanner scan = new Scanner(file);
        a1 = scan.nextLine();
        scan.close();
        result = "";
    }
    private static void DecodeToWords(String codestring)
    {

        String [] words = wordsplit.split(codestring, 2);
        //System.out.println("Test output String [1] : " + words[1] );

        DecodeToLetters(words[0]);
        result += " ";
        if (words.length == 2) // Рекурсивное разбиение на слова
        {
            DecodeToWords(words[1]);
        }

    }
    private static void DecodeToLetters(String codestring)
    {
        String[] letters = lettersplit.split(codestring, 2);
        result += map.get(letters[0]);
        if (letters.length == 2 ) //Рекурсивная расшифровка букв;
        {
            DecodeToLetters(letters[1]);
        }
    }
    private static Map<String, String> CreateMap()
    {
        Map<String,String> map = new HashMap<>();
        map.put("10111","а");
        map.put("111010101","б");
        map.put("1001110111","в");
        map.put("111011101","г");
        map.put("1110101","д");
        map.put("1","е");
        map.put("101010111","ж");
        map.put("11101110101","з");
        map.put("101","и");
        map.put("1011101110111","й");
        map.put("111010111","к");
        map.put("101110101","л");
        map.put("1110111","м");
        map.put("11101","н");
        map.put("11101110111","о");
        map.put("10111011101","п");
        map.put("1011101","р");
        map.put("10101","с");
        map.put("111","т");
        map.put("1010111","у");
        map.put("101011101","ф");
        map.put("1010101","х");
        map.put("11101011101","ц");
        map.put("1110111011101","ч");
        map.put("111011101110111","ш");
        map.put("1110111010111","щ");
        map.put("1110101110111","ы");
        map.put("11101010111","ь(ъ)");
        map.put("10101110101","э");
        map.put("10101110111","ю");
        map.put("10111010111","я");
        return map;

    }

    @Override
    public void imper() {
        DecodeToWords(a1);
        System.out.println(result);
    }
}

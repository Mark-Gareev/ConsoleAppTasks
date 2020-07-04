package Tasks;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Math.abs;


public class TaskCaesarDecoder extends Task {

    public TaskCaesarDecoder(String a,String b,String c)
    {
        super(a,b,c);
    }

    public TaskCaesarDecoder(String f_path) throws IOException
    {
       super(f_path);
    }
    @Override
    public void imper() throws IOException
    {

        try
        {

            Scanner pars1 = new Scanner(a1);
            Scanner pars2 = new Scanner(b1);
            Scanner pars3 = new Scanner(c1);
            ArrayList Book = new ArrayList();
            ArrayList CodeWords = new ArrayList();
            ArrayList Match = new ArrayList();
            String result = "";
            char [] alphabet  = new char []{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            while(pars1.hasNext())
            {
                Book.add(pars1.next());
            }
            while (pars3.hasNext())
            {
                CodeWords.add(pars3.next());
            }
            int NumOfCW = Integer.parseInt(pars2.nextLine());
            pars1.close();
            pars2.close();
            pars3.close();
            for( int i = 0; i < NumOfCW; i++)
            {
                    String innerstr = (String)CodeWords.get(i);
                    for (int j = 0; j < Book.size(); j++)
                    {
                        String BookElLength = (String)Book.get(j);
                        if(innerstr.length() == BookElLength.length())
                        {
                            Match.add(Book.get(j));
                        }
                    }
                    for (int j =0; j < Match.size(); j++)
                    {
                        String TargWord = (String)Match.get(j);
                        char First = TargWord.charAt(0);
                        char ToCast = innerstr.charAt(0);
                        int key = 0;
                        int keyReset = 0;
                        int pos1=0;
                        int pos2=0;
                        boolean arrow = true;
                        for( int k = 0; k < 26; k++)// to parse difference between of codeword and match word
                        {

                            if(ToCast == alphabet[k])
                            {
                                pos1 = k;
                            }
                            if(First == alphabet[k])
                            {
                                pos2 = k;
                            }



                        }
                        key = (pos2 - pos1);
                        System.out.println("Our key is: "+ key);
                        for( int h = 0; h < innerstr.length();h++ )//пробег по закодированному слову and change it
                        {
                            char t = innerstr.charAt(h);

                            int index_t = 0;
                            for (int g = 0; g < 26; g++) {
                                if (alphabet[g] == t) {
                                    index_t = g;

                                    System.out.println("G is : " + g + " Index_t is : " + index_t);
                                }
                            }
                            if (index_t + key > 25)
                            {
                                t = alphabet[index_t + key - 26];
                            }
                            if((index_t + key >= 0)&&(index_t + key <= 25))
                            {
                                t = alphabet[index_t + key];
                            }
                            if ((index_t + key < 0))
                            {
                                t = alphabet[25 - abs(key)];
                            }
                            result += String.valueOf(t);
                        }


                        //System.out.print("    !!Current result!!   "+ result);
                        }
                        System.out.println();
                        System.out.println("______________________");
                        System.out.println(result);
                        System.out.println("______________________");
                        result = "";
                        Match.clear();


            }


        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

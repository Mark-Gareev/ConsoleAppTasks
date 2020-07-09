package Tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class TaskAreaBetweenFunction extends Task
{
    /*Input format --
                First string -- N and M, number of part of funct F and G
                Second string -- range of integration, N+1 and M+1
                Third string -- values of polynomial N*3 for F and M*3 for G */


    int N = 0;
    int M = 0;
    ArrayList<String> RangeList_F = new ArrayList<String>();
    ArrayList<String> RangeList_G = new ArrayList<String>();
    ArrayList<String> Val_F = new ArrayList<String>();
    ArrayList<String> Val_G = new ArrayList<String>();


    public TaskAreaBetweenFunction(String f_path) throws IOException
    {
        super(f_path);
    }
    public double Integrate(double a, double b, double c, int l1, int l2 )
    {

        double r, r1, r2, r3;
        r = 0.0;
        r1 = (a * l2 * l2 * l2 / 3) - (a * l1 * l1 * l1 / 3);
        //System.out.println("There is r1 : " + r1);
        r2 = (b * l2 * l2 / 2) - (b * l1 * l1 / 2);
        //System.out.println("There is r2 : " + r2);
        r3 = c*l2 - c*l1;
        //System.out.println("There is r3 : " + r3);
        r = r1 + r2 + r3;
        //System.out.println("There is r : " + r);
        //System.out.println("_ _ _ _ _ _ _FIN _ _ _ _ _ ");
        return (r);

    }

    public void setData() throws  IOException
    {
        Scanner pars1 = new Scanner(a1);
        Scanner pars2 = new Scanner(b1);
        Scanner pars3 = new Scanner(c1);
        N = Integer.parseInt(pars1.next());
        //System.out.println("There is N : " + N);
        M = Integer.parseInt(pars1.next());
        //System.out.println("There is M : " + M);
        //System.out.println("______________________");
        pars1.close();

        for (int i = 0; i < N+1; i++)
        {
            RangeList_F.add(pars2.next());
            //System.out.println("There is RangelistF :" + RangeList_F.get(i));
        }
        for (int i = 0; i < M+1; i++)
        {
            RangeList_G.add(pars2.next());
            //System.out.println("There is RangeListG : " + RangeList_G.get(i));
        }
        pars2.close();
        //System.out.println("________________________");

        for(int i = 0; i < N*3; i++)
        {
            Val_F.add(pars3.next());
            //System.out.println("There is ValF : " + Val_F.get(i));
        }
        for(int i = 0; i < M*3; i++)
        {
            Val_G.add(pars3.next());
            //System.out.println("There is ValG : " + Val_G.get(i));
        }

    }
    @Override
    public void imper() throws IOException
    {
        setData();
        double INTEGR_F = 0,INTEGR_G = 0;
        int k;
        for(int i = 0; i < N; i++)
        {
            if(i>=1)
                k = i*3;
            else
                k = i;
            INTEGR_F += Integrate(Double.parseDouble(Val_F.get(k)), Double.parseDouble(Val_F.get(k + 1)), Double.parseDouble(Val_F.get(k + 2)), Integer.parseInt(RangeList_F.get(i)), Integer.parseInt(RangeList_F.get(i+1)));
            //System.out.println("Integrate was called with :" + Double.parseDouble(Val_F.get(k))+ " " + Double.parseDouble(Val_F.get(k + 1))+ " " + Double.parseDouble(Val_F.get(k + 2))+ " " + Integer.parseInt(RangeList_F.get(i)) + " " + Integer.parseInt(RangeList_F.get(i+1)));
            //System.out.println("Result is : " + INTEGR_F);

        }
        for(int i = 0; i < M; i++)
        {
            if(i>=1)
                k = i*3;
            else
                k = i;
            INTEGR_G+= Integrate(Double.parseDouble(Val_G.get(k)), Double.parseDouble(Val_G.get(k + 1)), Double.parseDouble(Val_G.get(k + 2)), Integer.parseInt(RangeList_G.get(i)), Integer.parseInt(RangeList_G.get(i+1)));
        }
        //System.out.println("Area F is : " + INTEGR_F);
        //System.out.println("Area G is : " + INTEGR_G);
        System.out.println("GENERAL RESULT IS : ");
        System.out.println("___________________________________________");
        if((INTEGR_F > 0)&&(INTEGR_G > 0))
        {
            System.out.println("Area between F & G is : " + abs(INTEGR_F-INTEGR_G));
        }
        if((INTEGR_F > 0)&&(INTEGR_G < 0))
        {
            System.out.println("Area between F & G is : " + (INTEGR_F + abs(INTEGR_G)));
        }
        if((INTEGR_F < 0)&&(INTEGR_G > 0))
        {
            System.out.println("Area between F & G is : " + (INTEGR_G + abs(INTEGR_F)));
        }
        if((INTEGR_F < 0)&&(INTEGR_G < 0))
        {
            System.out.println("Area between F & G is : " + abs(INTEGR_F+INTEGR_G));
        }
        System.out.println("___________________________________________");

    }




}
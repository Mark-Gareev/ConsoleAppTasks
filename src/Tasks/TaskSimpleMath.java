package Tasks;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class TaskSimpleMath extends Task {
    private int a,b;
    private double c,d;
    public TaskSimpleMath(File file)throws IOException {
        Scanner scan = new Scanner(file);
        a1 = scan.nextLine();
        scan.close();
        Scanner scan1 = new Scanner(a1);
        String i = scan1.next();
        System.out.println(i);
        String j = scan1.next();
        System.out.println(j);
        a = Integer.parseInt(i);
        b = Integer.parseInt(j);
        scan1.close();
        c = (double)a;
        d = (double)b;
    }
    private double round(double a, int pl)
    {
        BigDecimal F = new BigDecimal(Double.toString(a));
        F = F.setScale(pl,RoundingMode.HALF_UP);
        return F.doubleValue();
    }
    private double Divide (double d1,double d2)// b/c = x ==> b = cx
    {
        double res = 0;
        double delta = 0.01;
        while(d1 > multiply(d2,res))
        {
            res+=delta;
        }
        if(multiply(d2,res) > d1)
            res-=delta;

        return round(res,2);
    }
    private int substract(int a, int b)
    {
        int res = 0;
        res = a + negate(b);
        return res;

    }
    private int multiply(int a, int b)
    {
        int res = 0;
        for(int h = 0; h < a; h++)
            res +=b;
        return res;
    }
    private double multiply(double a, double b)
    {
        double res = 0;
        for(int h = 0; h < a; h++)
            res +=b;
        return res;
    }
    private int add(int a, int b)
    {
        return a+b;
    }
    private int negate(int a)
    {
        int res = 0;
        for(int m = 0; m < a; m++)
            res +=(-1);
        return res;
    }
    @Override
    public void imper()
    {
        Scanner scanner = new Scanner(System.in);
        String comm = "";
        while (!(comm.equals("e"))) {
            System.out.println("Command for task4 : \r\n  Divide \r\n  Substract \r\n  Add \r\n  Multiply \r\n To exit press \"e\"");
            System.out.println("Put your command:");
            comm = scanner.nextLine();
            if (comm.equals("Divide")) {
                System.out.println("a/b is : " + Divide(c, d));
            }
            if (comm.equals("Substract")) {
                System.out.println("a-b is : " + substract(a, b));
            }
            if (comm.equals("Add")) {
                System.out.println("a+b is : " + add(a, b));
            }
            if (comm.equals("Multiply")) {
                System.out.println("a*b is : " + multiply(a, b));
            }
        }


    }


}

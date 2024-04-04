import java.util.Scanner;
public class Test
{

public static void main(String[] args)
    {
        //initialization
        Scanner Obj = new Scanner(System.in);
        int sumRes = 0;
        System.out.println("Choose the number of parameters to pass to SUM:");
        System.out.println("1\n2");
        int op=(int)get_data(Obj);
        //check validation of inputs
        while(true)
        {
            if(op==1||op==2)
                break;
            else
            {
                System.out.println("enter a invalid number");
                op=(int)get_data(Obj);
            }

        }
        //calculations
        System.out.println("Result: " +calc(op,Obj,sumRes) );
        Obj.close();
    }

//validating inputs
    public static double get_data(Scanner o)
    {
        double z;
        while(true)
        {
            try //Handling Exception miss match &stack overflow
            {
                z = o.nextDouble();
                if(z>10000)
                    System.out.println("Large number,please enter valid number");
                else
                    return z;
            }
            catch (Exception e)
            {
                System.out.println("you have entered wrong value,please enter a valid value");
                o.nextLine();
            }
        }
    }
    
    public static int calc(int n,Scanner o,int sum)
    {
        switch (n)
        {
            case 1:
            {
                System.out.println("Choose the data type of parameter to pass to SUM:");
                System.out.println("1. int\n2. double");
                int select = (int) get_data(o);
                while (true)
                {
                    if (select == 1 || select == 2)
                        break;
                    else
                    {
                        System.out.println("invalid choice \ntry another one");
                        select = (int) get_data(o);
                    }

                }
                switch (select)
                {
                    case 1:
                    {
                        System.out.println("Please enter an integer");
                        int input;
                        input = (int) get_data(o);
                        sum = sum(input);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Please enter a float");
                        float input;
                        while (true)
                        {
                            try
                            {
                                input = (float) get_data(o);
                                break;
                            }
                            catch (Exception e)
                            {
                                System.out.println("Please enter a valid value");
                                o.nextLine();
                            }
                        }
                        sum = sum(input);
                        break;
                    }
                }
            }
            break;
            case 2:
            {
                System.out.println("Choose the two integers to pass to SUM:");
                int min = (int) get_data(o);
                int max = (int) get_data(o);
                if (min > max)
                {
                    //change of variables with XOR
                    min = min ^ max;
                    max = min ^ max;
                    min = min ^ max;
                }
                sum = sum(min, max);
                break;
            }
        }
        return sum;
    }

    // Method to calculate sum recursively for integer inputs
    public static int sum(int k)
    {
        if (k > 0)
            return k + sum(k - 1);
         else if (k < 0)
            return k + sum(k + 1);
         else
            return 0;

    }

    // Method to calculate sum for double inputs
    public static int sum(double k)
    {
        if (k > 0)
            return (int) Math.round(k) + sum((int) k - 1);
        else if(k<0)
            return (int) Math.round(k)+sum((int)k+1);
        else
            return 0;
    }

    // Method to calculate sum recursively for a range of integers
    public static int sum(int start, int end)
    {
        if (end > start)
            return end + sum(start, end - 1);
        else
            return end;
    }
}
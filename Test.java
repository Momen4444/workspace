import java.util.*;
public class Test
{
public static void main(String[] args)
    {
     System.out.println("Choose the number of parameters to pass to SUM:");
     System.out.println("1\n2");
     int sumRes = 0;
     int op=getdata();
     Scanner Obj = new Scanner(System.in);
        while(true)
        {
            if(op==1||op==2)
                break;
            else
            {
                System.out.println("inviled choice \ntry another one");
                op=Obj.nextInt();
            }

        }

        switch (op)
        {
            case 1:
                System.out.println("Choose the data type of parameter to pass to SUM:");
                System.out.println("1. int\n2. double");
                int select =getdata() ;
                while(true)
                {
                    if(select==1||select==2)
                        break;
                    else
                    {
                        System.out.println("inviled choice \ntry another one");
                        select=Obj.nextInt();
                    }

                }
                switch (select)
                {
                    case 1:
                    {
                        System.out.println("Please enter an integer");
                        int input = 0;
                        getdata();
                        sumRes = sum(input);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Please enter a float");
                        float input=0;
                        while(true)
                        {
                          try
                          {
                              Scanner O=new Scanner(System.in);
                              input = O.nextFloat();
                              O.close();
                              break;
                          }
                          catch (Exception e)
                          {
                              System.out.println("Please enter a valid value");
                          }
                        }
                        sumRes = sum(input);
                        break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Choose the two integers to pass to SUM:");
                    int min =getdata();
                    int max = getdata();
                    if(min>max)
                    {
                     min=min^max;
                     max=min^max;
                     min=min^max;
                    }
                    sumRes = sum(min, max);
                    break;
                default:
                    System.out.println("invalid input");
            }
        Obj.close();
        System.out.println("Result: " + sumRes);
     }

    public static int getdata()
    {
        int z=0;
        while(true)
            try
            {
                Scanner myobj=new Scanner(System.in);
                z=myobj.nextInt();
                return z;
            }
        catch(Exception e)
        {
            System.out.println("you enterd wrong value,please enter a vaild value");

        }

    }
    // Method to calculate sum recursively for integer inputs
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // Method to calculate sum for double inputs
    public static int sum(double k) {
        if (k > 0) {
            return (int) Math.round(k) + sum((int) k - 1);
        } else {
            return 0;
        }
    }
    // Method to calculate sum recursively for a range of integers
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
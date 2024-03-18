public  class Problems
{
    public static void main(String[] args)
    {
        //every block has its own problem
        //#1
        {
            //what is the output?
            if (true)
                break;
        }



//#2
        {
            //what is the output
            System.out.println('j' + 'a' + 'v' + 'a');
        }



//#3
        {
            class Mobile
            {
                private int year;
                String company_name;
            }
            public class new
             {
                public static void main(String[] args)
                 {
                     Mobile c=new Mobile();
                     c.year=2018;
                     c.company_name="samsung";
                     System.out.println(c.company_name);
                 }

             }
        }



//#4
        {
            class pen
            {
            final int price=44;
            }
            public class p
            {
                public static void main(String[] args)
                {
                    pen pp=new pen();
                    pp.price=20;
                    System.out.println(pp.price);
                }
            }
        }
    }
}
import java.util.*;
public class Guess {
    public static void main(String[] args) {
        Random r =new Random();
        int var=r.nextInt(100)+1;
        int count=0;
        int Marks=10;
        Scanner k =new Scanner(System.in);
        System.out.println("Lets! start the game");
        System.out.println("Guess a number between 1 to 100");
        while(true)
        {
            System.out.println("Enter your choice");
            int l=k.nextInt();
            count++;
            if(count<=9)
            {
                if(l<var)
               {
                  System.out.println("To low! try again");
                  Marks--;

               }
               else if(l>var)
               {
                 System.out.println("To High! exceed the number try again");
                 Marks--;
                }
                else
                {
                    System.out.println("Hurray!! you got correct guess");
                    System.out.println("No.of attempts wasted="+(count-1));
                    System.out.println("you got correct in no of attempts="+count);
                    System.out.println("your total Marks are"+Marks+"/10");
                    break;
                }

            }
            else 
            {
                System.out.println("Time up!!");
                System.out.println("No.of attempts wasted="+(count-1));
                System.out.println("your total Marks are"+Marks+"/10");
                

                
                
            }

        }
    }
    
}

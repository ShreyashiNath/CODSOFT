import java.util.Scanner;

class range{
    public int Generate(int min , int max){
        return (int) (Math.random()*(max - min +1)+min);
    }
}

public class Number_Game{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);

        int TotalNumberOfAttempts =0;
        int win=0;
        range r = new range();
        
        while(true){
            System.out.println("Enter minimum number : ");
            int min = sc.nextInt();
            System.out.println("Enter maximum number : ");
            int max = sc.nextInt();
            sc.nextLine();

            int num = r.Generate(min, max);
            int attempt=0;

            while(true){
                System.out.println("Guess a number between "+min+" and " +max);
                int Guess_num=sc.nextInt();
                attempt++;

                if(Guess_num>num){
                    System.out.println("It is greater than the actual number .");
                }
                else if(Guess_num<num){
                    System.out.println("It is lower than the actual number .");
            }
            else{
                System.out.println("This is correct number .");
                win++;
                break;
            }
        }
        
            TotalNumberOfAttempts += attempt;
            System.out.println("Number of attempt : "+attempt);
            System.out.println("Win : "+win);
            double score =(double)win/ TotalNumberOfAttempts*100;
            System.out.printf("Score : %.2f%%\n",score);

            System.out.println("Do you play again (yes or no)");
            String playagain = sc.next();
            if (!playagain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);
            }
        }
      
    }
}
import java.util.Scanner;

public class ATM_INTERFACE{
    public static void main(String[] args) {
        int Total_Balance = 10000000;
        int withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Machine");
            System.out.println("Type 1 for withdraw");
            System.out.println("Type 2 for deposit");
            System.out.println("Type 3 for checking balance");
            System.out.println("Type 4 for exit");
            System.out.println("Type the option number which you want to do : ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the balance which you want to withdraw : ");
                    withdraw = sc.nextInt();
                    if(Total_Balance >= withdraw){
                        Total_Balance -= withdraw;
                        System.out.println("Please collect your money .");
                        System.out.println("Thank You.");
                    }
                    else{
                        System.out.println("Insufficient Balance found.");
                        System.out.println("Thank You.");
                    }
                    break;
            
                case 2:
                System.out.println("Enter the balance which you want to deposite : ");
                deposit = sc.nextInt();
                Total_Balance += deposit;
                System.out.println("Your money successfully deposited .");
                System.out.println("Thank You.");
                    break;
                
                case 3:    
                System.out.println("Your total balance is "+ Total_Balance+".");
                System.out.println("Thank You.");
                break;

                case 4:
                System.exit(0);
            }
        }
    }
}
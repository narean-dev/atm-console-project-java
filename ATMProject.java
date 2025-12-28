import java.util.Scanner;
public class ATMProject{
public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int balance = 25000;
    int choice;
    int amount;
    int pin = 9021;
    int enteredpin;
    int attempts =0;

    //PIN CHECK

    while(attempts<3){
        System.out.println("enter ATM PIN");
        enteredpin = scan.nextInt();
        if(enteredpin==pin){
            System.out.println("PIN verified");
            break;
        }
        else{
            attempts++;
            System.out.println("worng PIN attempts left "+ (3-attempts));
        }
        if(attempts==3){
            System.out.println("ATM Blocked");
            return;
        }
    }

    //ATM MENU
    while(true){
        System.out.println("\n----ATM MENU----");
        System.out.println("1. check balance");
        System.out.println("2. Deposit");
        System.out.println("3. withdraw");
        System.out.println("4.Exit");
        System.out.println("Enter choice");
        choice = scan.nextInt();
        switch(choice){

        case 1:
            System.out.println("Account balance" + balance);
            break;

            case 2:
                System.out.println("Enter Deposite amount");
                amount = scan.nextInt();
                if(amount>0){
                    balance=balance+amount;
                    System.out.println("Amount Deposited");
                }
                else{
                    System.out.println("invalied amount");
                }
                break;

                case 3:
                    System.out.println("Enter withdraw amount");
                    amount = scan.nextInt();
                    if(amount>0 && amount<=balance){
                        balance=balance-amount;
                        System.out.println("please collect your cash");
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    break;

                    case 4:
                        System.out.println("Thank you for using ATM");
                        return;
        }
    }
}
}

    
            
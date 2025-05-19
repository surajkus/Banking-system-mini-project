import java.util.*;
public class Login {

   public static void main(String[] args){

    }
    static void login(){

        Scanner sc =new Scanner(System.in);
        System.out.println(" Welcome in Login Portal");
        System.out.println("Enter your phone no/account no");
        Main.index = Main.phone.indexOf(sc.next());
        System.out.println("Enter your password");
       if(Main.password.get(Main.index).equals(sc.next())) {

           System.out.println("successful login");
           System.out.println("cash deposit  them Enter 1 And withdraw cash Enter 2  ");
           System.out.println("1.amountAdd");
           System.out.println("2.withdraw");
           int num = sc.nextInt();
           double money = 0;
           int i=0;
           double TotalMoney=0;
           switch (num) {
                     case 1:
                         System.out.println("how much money deposit in your account");
                         money = sc.nextDouble();
                         Main.bankBalance.add(money);
                         TotalMoney = money;
                         System.out.println(TotalMoney);
                         Main.Totalcash =TotalMoney;

                         break;
                     case 2:
                         System.out.println("how want to withdraw money");
                         double w_money = sc.nextDouble();
                         double totalBalance = Main.Totalcash - w_money;
                         Main.bankBalance.set(Main.index, totalBalance);
                         System.out.println(totalBalance);
                         break;
           }
          }

       else {
           System.out.println("login failed");
           try{
               System.out.println("password reset");
               System.out.println("Created a new password");
               Main.password.set(Main.index,(sc.next()));
           } catch (Exception e) {
               System.out.println("Carefully  Enter the value");
           }finally {
               System.out.println("successfully reset your password");
           }
       }

        }

    }

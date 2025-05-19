import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> Name = new ArrayList<>();
    static  ArrayList<Integer> ACNumber= new ArrayList<>();
    static  ArrayList<String> phone = new ArrayList<>();
    static  ArrayList<String> password= new ArrayList<>();
    static  ArrayList<String> Gender= new ArrayList<>();
    static  ArrayList<String>  address = new ArrayList<>();
    static  ArrayList<String>  AdhaarNo= new ArrayList<>();
    static  ArrayList<Double>  bankBalance = new ArrayList<>();
    static Integer Acc_no =0;
       static Integer index;
       static  double Totalcash;
    //static Integer Index;
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Bank");
        boolean check = true;
        while(check) {

        System.out.println("choose the service you want...");
            System.out.println("1. Account_create");
            System.out.println("2. login");
            System.out.println("3. exit");
            System.out.println("4. show_details");
            System.out.println("5. Account_Deleted");
            int num= sc.nextInt();
        switch(num){
            case 1:
                Creation_Account.Account_creation();
              break;

            case 2:
                Login.login();
                break;
            case 3:
                check = false;
                break;
            case 4:
                Show_details.shows();
                break;
            case 5:
                Account_Deleted.delete();
                break;
        }

        }
    }
}
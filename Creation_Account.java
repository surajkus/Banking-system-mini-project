import java.util.Scanner;

public class Creation_Account{
    public static void main(String[] args) {


        }
         static void Account_creation(){
        Scanner sc = new Scanner(System.in);
             System.out.print("Enter your name = ");
             Main.Name.add(sc.nextLine());
             Main.ACNumber.add(Main.Acc_no);
             Main.Acc_no++;
             System.out.print("Enter your phone number = ");
             Main.phone.add(sc.nextLine());
             System.out.print("Enter new password = ");
             Main.password.add(sc.next());
            System.out.print("Enter your gender = ");
            Main.Gender.add(sc.next());
             System.out.print("Enter your address = ");
             Main.address.add(sc.next());
             System.out.print("Enter your AdhaarNumber = ");
             Main.AdhaarNo.add(sc.next());


    }
}

import java.util.Scanner;

public class Account_Deleted {
    public static void main(String[] args) {

    }
    static void delete(){
        Scanner sc= new Scanner(System.in);
        System.out.println("choose the index number for deleted Customer_account");
          int i= (Main.Acc_no)-1;
        if((i)==(sc.nextInt())){
              Main.phone.remove(i);
            System.out.println("Sucessfully deleted account");
        }
        else{
           System.out.println("something is wrong");
        }


    }
}

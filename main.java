import java.util.Scanner;

public class main {
    public static void main(String[] args){
        grocerystore customer1 = new grocerystore();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter customer name");
        customer1.setCustomername(sc.nextLine());
        System.out.println("enter customer address");
        customer1.setAddress(sc.nextLine());
        System.out.println("enter customer id");
        customer1.setCustomerid(sc.nextInt());
        System.out.println("enter customer number");
        customer1.setContact(sc.nextInt());
        customer1.setAmount(1250);
        System.out.println("Do you want to add balance?");
        customer1.setBalance(sc.nextInt());
    }
}

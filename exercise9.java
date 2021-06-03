import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int x=0;
        x= kb.nextInt();
	    int result= (x/350)+1;
	    System.out.println("You will need to purchase "+result+" to cover "+x+" square feet.");
    }
}

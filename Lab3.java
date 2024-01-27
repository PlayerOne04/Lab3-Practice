
import java.util.Scanner;

public class Lab3 {
 
    public static void main(String[] args) {

        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        firstName = scan.nextLine();

        System.out.println("Please enter last name: ");
        lastName = scan.nextLine();

fullName = firstName + " " + lastName;

"fullName".toUpperCase();

nameLength = fullName.length();

System.out.println("Full name (in capitals): " + fullName.toUpperCase());

System.out.println("Length of full name: " + nameLength);

        String title1 = new String("CS1400");
        String title2 = "CS1400";

        if ( title1 == title2 ) {

        	System.out.println("String comparison using \"==\" sign works");
        } else {
 
        	System.out.println("String comparison using \"==\" sign does NOT work");
        }
        if ( title1.equals(title2) ) {

        	System.out.println("String comparison using .equals method works");
        } else {

        	System.out.println("String comparison using .equals method does NOT work");
        }

        scan.close();

    } 
} 
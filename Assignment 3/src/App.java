import java.util.Scanner;   
public class App {
    public static void main(String[] args) throws Exception {
        Float userNum; 
        String userUnits;
        Scanner scnr = new Scanner(System.in);
        System.out.println("enter a number");
        userNum = scnr.nextFloat();

        scnr.nextLine();

        
        
        

        while (userNum != -1) {
            System.out.println("Enter the units");
            userUnits = scnr.nextLine();
        if (userUnits.equals("mi")) {
            userNum =  (float) (userNum * 1.609344);
            System.out.println("You're conversion from miles to kilometer is " + userNum + "km");
        }else if (userUnits.equals("cm")) {
            userNum =  (float) (userNum * 0.39370);
            System.out.println("Your conversion from centimeters to inches is " + userNum + "in");
        }else if (userUnits.equals("ft")) {
          userNum = (float) (userNum * 12.0);
          System.out.println("Your conversion from feet to inches is " + userNum + "in");  
        }else if (userUnits.equals("lbs")) {
            userNum = (float) (userNum * 0.4535923);
            System.out.print("Your conversion from pounds to kilograms is " + userNum + "kg");
        }else {
            System.out.println("Invalid units. this program can only handle:");
            System.out.println("miles to kilometers");
            System.out.println("centimeters to inches");
            System.out.println("feet to inches");
            System.out.println("pounds to kilograms");
        }
        System.out.println("enter a number");
        userNum = scnr.nextFloat();

        scnr.nextLine();
        if (userNum == -1) {
            break;
            // System.out.println("Enter the units");
            // userUnits = scnr.nextLine();
        }
        // System.out.println("Enter the units");
        // userUnits = scnr.nextLine();
        }


        scnr.close();
    }
}



package hospital.main;

import hospital.exception.InvalidChoiceException;
import hospital.service.HospitalService;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {
        HospitalService service = new HospitalService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Add Doctor / Patient");
            System.out.println("2. View All Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        service.add();
                        break;
                    case 2:
                        service.view();
                        break;
                    case 3:
                        System.out.println("Exiting System. Thank you!");
                        System.exit(0);
                    default:
                        throw new InvalidChoiceException("Invalid menu choice!");
                }
            } catch (InvalidChoiceException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Please enter valid input.");
                sc.next();
            }
        }
    }
}

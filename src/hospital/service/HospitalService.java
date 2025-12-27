package hospital.service;

import hospital.model.Doctor;
import hospital.model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalService implements Manageable {

    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Doctor ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Specialization: ");
            String spec = sc.nextLine();

            doctors.add(new Doctor(id, name, age, spec));
            System.out.println("Doctor added successfully!");

        } else if (choice == 2) {
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            patients.add(new Patient(id, name, age, disease));
            System.out.println("Patient added successfully!");
        }
    }

    @Override
    public void view() {
        System.out.println("\n--- Doctors List ---");
        for (Doctor d : doctors) {
            d.displayInfo();
        }

        System.out.println("\n--- Patients List ---");
        for (Patient p : patients) {
            p.displayInfo();
        }
    }
}

package hospital.model;

public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("---------------------------");
    }
}

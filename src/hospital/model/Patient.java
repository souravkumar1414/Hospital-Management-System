package hospital.model;

public class Patient extends Person {
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        super(id, name, age);
        this.disease = disease;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Disease: " + disease);
        System.out.println("---------------------------");
    }
}

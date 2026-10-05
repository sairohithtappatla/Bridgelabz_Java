package objectOrientedProgramming.staticFinalInstanceof.level1;

public class Patient {
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = Math.max(age, 0);
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void displayIfPatient(Object object) {
        if (object instanceof Patient) {
            Patient patient = (Patient) object;
            patient.displayDetails();
        } else {
            System.out.println("The object is not a Patient.");
        }
    }

    public static void main(String[] args) {
        Patient first = new Patient("Rohith", 21, "Fever", "PT1001");
        Patient second = new Patient("Sai", 22, "Cold", "PT1002");

        displayIfPatient(first);

        System.out.println("\nTotal Patients: " + Patient.getTotalPatients());

        System.out.println("\nChecking a different object:");
        displayIfPatient("Patient");
    }
}
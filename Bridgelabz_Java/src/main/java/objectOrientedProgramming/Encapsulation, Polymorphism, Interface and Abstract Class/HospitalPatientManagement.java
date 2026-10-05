import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(
            int patientId,
            String name,
            int age) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println(
            "Bill: ₹" + calculateBill()
        );
    }
}

interface MedicalRecord {
    void addRecord(String record);

    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    public InPatient(
            int patientId,
            String name,
            int age,
            int daysAdmitted) {

        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * 3000;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(
            int patientId,
            String name,
            int age,
            double consultationFee) {

        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + records);
    }
}

public class HospitalPatientManagement {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        InPatient inPatient =
            new InPatient(
                101,
                "Rohith",
                21,
                3
            );

        OutPatient outPatient =
            new OutPatient(
                102,
                "Arjun",
                25,
                800
            );

        inPatient.addRecord("Fever treatment");
        outPatient.addRecord("General consultation");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {

            patient.getPatientDetails();

            MedicalRecord record =
                (MedicalRecord) patient;

            record.viewRecords();

            System.out.println("--------------------");
        }
    }
}
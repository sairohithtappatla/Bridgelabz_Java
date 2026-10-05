package objectOrientedProgramming.objectOrientedDesign.selfProblems.level1.hospital;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (doctor != null && !doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void displayDoctors() {
        System.out.println("\nDoctors consulted by " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }
}

class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (patient == null) {
            return;
        }

        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this);

        System.out.println("Dr. " + name + " (" + specialization
                + ") is consulting " + patient.getName() + ".");
    }

    public void displayPatients() {
        System.out.println("\nPatients of Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (doctor != null && !doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (patient != null && !patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void displaySummary() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors: " + doctors.size());
        System.out.println("Patients: " + patients.size());
    }
}

public class HospitalAssociation {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Care Hospital");

        Doctor doctor1 = new Doctor("Kumar", "Cardiology");
        Doctor doctor2 = new Doctor("Priya", "General Medicine");

        Patient patient1 = new Patient("Rohith");
        Patient patient2 = new Patient("Sai");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        hospital.displaySummary();
        doctor1.displayPatients();
        patient1.displayDoctors();
    }
}
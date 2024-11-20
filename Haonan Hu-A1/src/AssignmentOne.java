import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {

        // Create three General Practitioner objects
        // Here we are instantiating three different General Practitioner objects
        // Each with its own unique ID, name, basic service information, and specialty area.
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Zhao", "General medical services", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Qian", "General medical services", "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Sun", "General medical services", "Pediatrics");

        // Create two other types of Health Professional objects
        // Similarly, I create two objects of other types of health professionals
        // Each having its own details like ID, name, specific service information, and specialized area.
        OtherHealthProfessional ohp1 = new OtherHealthProfessional(4, "Dr. Li", "Specialized medical services", "Cardiology");
        OtherHealthProfessional ohp2 = new OtherHealthProfessional(5, "Dr. Wang", "Specialized medical services", "Orthopedics");

        // Print details for all health professionals
        // This method call will display the detailed information of all the health professionals we've created above.
        printHealthProfessionalsDetails(gp1, gp2, gp3, ohp1, ohp2);

        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // Create appointments
        // Here we are creating four different appointments, each with a specific patient,
        // their mobile phone number, a preferred time slot, and a selected health professional.
        createAppointment(appointmentList, "Xiao Zhao", "15298765432", "08:00", gp1);
        createAppointment(appointmentList, "Xiao Qian", "15398765432", "10:00", gp2);
        createAppointment(appointmentList, "Xiao Sun", "15498765432", "14:30", ohp1);
        createAppointment(appointmentList, "Xiao Li", "15598765432", "16:00", ohp2);

        // Print existing appointments
        // This will show the details of all the existing appointments in the appointmentList.
        printExistingAppointments(appointmentList);

        // Cancel an appointment
        // We try to cancel an appointment based on the provided patient's mobile phone number.
        cancelBooking(appointmentList, "15498765432");

        // Print the existing appointment again
        // This is to display the updated appointment collection after the cancellation operation.
        printExistingAppointments(appointmentList);
    }

    // Method to print health professional details
    // This method takes in multiple health professional objects and prints their detailed information.
    // It separates the output for General Practitioners and Other Health Professionals for better readability.
    private static void printHealthProfessionalsDetails(GeneralPractitioner gp1, GeneralPractitioner gp2, GeneralPractitioner gp3, OtherHealthProfessional ohp1, OtherHealthProfessional ohp2) {
        System.out.println("Details of General Practitioners:");
        gp1.printHealthProfessionalDetails();
        System.out.println("------------------------------");
        gp2.printHealthProfessionalDetails();
        System.out.println("------------------------------");
        gp3.printHealthProfessionalDetails();
        System.out.println("------------------------------");

        System.out.println("Details of Other Health Professionals:");
        ohp1.printHealthProfessionalDetails();
        System.out.println("------------------------------");
        ohp2.printHealthProfessionalDetails();
        System.out.println("------------------------------");
    }

    // Method to create a new appointment and add it to ArrayList
    // This method creates a new Appointment object with the given details and adds it to the appointmentList.
    public static void createAppointment(ArrayList<Appointment> appointmentList, String patientName, String patientMobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        Appointment newAppointment = new Appointment(patientName, patientMobilePhone, preferredTimeSlot, selectedDoctor);
        appointmentList.add(newAppointment);
    }

    // Method to print existing appointments
    // If the appointmentList is empty, it will print a message indicating so.
    // Otherwise, it will iterate through the list and print the details of each appointment.
    public static void printExistingAppointments(ArrayList<Appointment> appointmentList) {
        if (appointmentList.isEmpty()) {
            System.out.println("There are no existing appointments.");
        } else {
            for (Appointment appointment : appointmentList) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Method to cancel an appointment based on the patient's mobile phone number
    // It searches for the appointment with the given mobile phone number in the appointmentList.
    // If found, it removes the appointment from the list. If not, it prints a message indicating that.
    public static void cancelBooking(ArrayList<Appointment> appointmentList, String patientMobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).getPatientMobilePhone().equals(patientMobilePhone)) {
                appointmentList.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The mobile phone number was not found in the existing appointments.");
        }
    }
}
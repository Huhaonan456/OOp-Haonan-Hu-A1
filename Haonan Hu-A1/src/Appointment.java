class Appointment {

    // Used to store the patient's name.
    private String patientName;
    // Used to store the patient's mobile phone number so that we can contact the patient later for confirming the appointment and other matters.
    private String patientMobilePhone;
    // Used to store the preferred time slot for the patient's appointment, for example, in formats like "08:00", "10:00", etc.
    private String preferredTimeSlot;
    // Used to store the selected health professional object. Through polymorphism, it can be a General Practitioner
    // or other types of health professionals (OtherHealthProfessional).
    private HealthProfessional selectedDoctor;

    // Default constructor, which can be used to create a default appointment object first in certain situations,
    // and then set the specific information later. For example, when creating a temporary placeholder appointment object
    // and filling in the complete information according to the actual situation afterwards.
    public Appointment() {
    }

    // Constructor with all parameters, used to initialize all instance variables of the appointment object.
    // By passing in specific parameter values, a complete appointment object with detailed information can be created.
    public Appointment(String patientName, String patientMobilePhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        // Assign the passed-in patient's name to the patientName variable of the current appointment object,
        // ensuring that the object records the correct patient name information.
        this.patientName = patientName;
        // Assign the passed-in patient's mobile phone number to the patientMobilePhone variable of the current appointment object,
        // so that we can accurately contact the patient later.
        this.patientMobilePhone = patientMobilePhone;
        // Assign the passed-in preferred time slot to the preferredTimeSlot variable of the current appointment object,
        // used to record the patient's expected appointment time.
        this.preferredTimeSlot = preferredTimeSlot;
        // Assign the passed-in selected health professional object to the selectedDoctor variable of the current appointment object,
        // making the appointment object clearly know which health professional the patient wants to make an appointment with.
        this.selectedDoctor = selectedDoctor;
    }

    // This method is used to print all the instance variable information of the appointment object.
    // By calling this method, we can clearly view the specific detailed information of an appointment,
    // including patient information, appointment time, and selected doctor information, etc.
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile Phone: " + patientMobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor:");
        if (selectedDoctor instanceof GeneralPractitioner) {
            ((GeneralPractitioner) selectedDoctor).printHealthProfessionalDetails();
        } else if (selectedDoctor instanceof OtherHealthProfessional) {
            ((OtherHealthProfessional) selectedDoctor).printHealthProfessionalDetails();
        }
    }

    // Method to get the patient's name. Other classes can call this method to obtain the patient name information
    // in the appointment object.
    public String getPatientName() {
        return patientName;
    }

    // Method to set the patient's name. When the patient name in the appointment object needs to be updated,
    // this method can be called and a new patient name can be passed in.
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    // Method to get the patient's mobile phone number, used to obtain the patient's mobile phone number recorded
    // in the appointment object in other classes.
    public String getPatientMobilePhone() {
        return patientMobilePhone;
    }

    // Method to set the patient's mobile phone number. If the patient's mobile phone number changes,
    // this method can be called to update the mobile phone number information recorded in the appointment object.
    public void setPatientMobilePhone(String patientMobilePhone) {
        this.patientMobilePhone = patientMobilePhone;
    }

    // Method to get the preferred time slot, making it convenient for other classes to obtain the preferred time slot
    // information in the appointment object.
    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    // Method to set the preferred time slot. When the patient wants to change the preferred time slot for the appointment,
    // this method can be used to update the corresponding information in the appointment object.
    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    // Method to get the selected health professional object. Other classes can call this method to obtain the
    // health professional object associated with the appointment object.
    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    // Method to set the selected health professional object. If the patient wants to change the health professional
    // for the appointment, this method can be called to update the relevant information in the appointment object.
    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}
class GeneralPractitioner extends HealthProfessional {

    // This variable stores the specialty area of the General Practitioner.
    // For example, it could be "Family Medicine", "Internal Medicine", etc.
    private String specialty;

    // Default constructor for GeneralPractitioner class.
    // It can be used when creating a GeneralPractitioner object without initializing all the instance variables immediately.
    // Maybe later we will set the values for other variables separately.
    public GeneralPractitioner() {
    }

    // Constructor that initializes all instance variables, including those inherited from the base class (HealthProfessional).
    // This allows us to create a fully initialized GeneralPractitioner object with specific values for ID, name, basicInfo, and specialty.
    public GeneralPractitioner(int ID, String name, String basicInfo, String specialty) {
        // Call the constructor of the superclass (HealthProfessional) to initialize the inherited instance variables.
        super(ID, name, basicInfo);
        // Set the specialty for this GeneralPractitioner object.
        this.specialty = specialty;
    }

    // Method to print the detailed information of the health professional, including the type (which is General Practitioner in this case).
    // This method first prints the common details from the superclass and then adds the specific details related to the General Practitioner.
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        // Call the printDetails method of the superclass to print the common information like ID, name, and basicInfo.
        super.printDetails();
        System.out.println("Type: General Practitioner");
        System.out.println("Specialty: " + specialty);
    }

    // Getter method for the specialty variable.
    // It allows other parts of the program to access the value of the specialty of this GeneralPractitioner object.
    public String getSpecialty() {
        return specialty;
    }

    // Setter method for the specialty variable.
    // It enables other parts of the program to change the value of the specialty of this GeneralPractitioner object if needed.
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
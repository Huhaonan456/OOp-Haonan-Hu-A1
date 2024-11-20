class OtherHealthProfessional extends HealthProfessional {

    // This variable stores specific information related to this type of health professional.
    // It could be details about a particular specialization, a unique skill set, or any other relevant details
    // that distinguish this type of health professional from others, especially from General Practitioners.
    private String specificInfo;

    // Default constructor for the OtherHealthProfessional class.
    // It can be used when we initially create an object of this type without immediately setting all the instance variables.
    // We might set the values for other variables later on as needed.
    public OtherHealthProfessional() {
    }

    // Constructor that initializes all instance variables, including those inherited from the base class (HealthProfessional).
    // This allows us to create a fully configured OtherHealthProfessional object with specific values for ID, name, basicInfo, and specificInfo.
    public OtherHealthProfessional(int ID, String name, String basicInfo, String specificInfo) {
        // Call the constructor of the superclass (HealthProfessional) to initialize the inherited instance variables.
        super(ID, name, basicInfo);
        // Set the specific information for this OtherHealthProfessional object.
        this.specificInfo = specificInfo;
    }

    // Method to print the detailed information of the health professional, including the type (which is Other Health Professional in this case).
    // This method first prints the common details from the superclass and then adds the specific details related to this type of health professional.
    public void printHealthProfessionalDetails() {
        System.out.println("The health professional details are:");
        // Call the printDetails method of the superclass to print the common information like ID, name, and basicInfo.
        super.printDetails();
        System.out.println("Type: Other Health Professional");
        System.out.println("Specific Information: " + specificInfo);
    }

    // Getter method for the specificInfo variable.
    // It allows other parts of the program to access the value of the specificInfo of this OtherHealthProfessional object.
    public String getSpecificInfo() {
        return specificInfo;
    }

    // Setter method for the specificInfo variable.
    // It enables other parts of the program to change the value of the specificInfo of this OtherHealthProfessional object if needed.
    public void setSpecificInfo(String specificInfo) {
        this.specificInfo = specificInfo;
    }
}
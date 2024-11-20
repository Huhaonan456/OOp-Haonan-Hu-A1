class HealthProfessional {

    // This variable stores the unique identifier for the health professional.
    // It's used to distinguish one health professional from another.
    // For example, it could be an employee number or some other identification number.
    private int ID;

    // This variable holds the name of the health professional.
    // It could be something like "Dr. Smith" or "Nurse Johnson".
    private String name;

    // This variable contains some basic information about the health professional.
    // It might include details such as their area of expertise in a more general sense,
    // or any other relevant general information about their work.
    private String basicInfo;

    // Default constructor for the HealthProfessional class.
    // It can be used when we want to create a HealthProfessional object first and then set its properties later.
    // Maybe we don't have all the necessary information available at the moment of object creation.
    public HealthProfessional() {
    }

    // Constructor that initializes all the instance variables of the HealthProfessional class.
    // This allows us to create a fully configured HealthProfessional object with specific values for ID, name, and basicInfo.
    public HealthProfessional(int ID, String name, String basicInfo) {
        // Set the ID of the health professional.
        this.ID = ID;
        // Set the name of the health professional.
        this.name = name;
        // Set the basic information of the health professional.
        this.basicInfo = basicInfo;
    }

    // Method to print out all the instance variables of the HealthProfessional object.
    // This helps in getting a quick overview of the details of a particular health professional.
    public void printDetails() {
        System.out.println("Doctor ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Basic Information: " + basicInfo);
    }

    // Getter method for the ID variable.
    // It allows other parts of the program to access the value of the ID of this HealthProfessional object.
    public int getID() {
        return ID;
    }

    // Setter method for the ID variable.
    // It enables other parts of the program to change the value of the ID of this HealthProfessional object if needed.
    public void setID(int ID) {
        this.ID = ID;
    }

    // Getter method for the name variable.
    // It allows other parts of the program to access the value of the name of this HealthProfessional object.
    public String getName() {
        return name;
    }

    // Setter method for the name variable.
    // It enables other parts of the program to change the value of the name of this HealthProfessional object if needed.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the basicInfo variable.
    // It allows other parts of the program to access the value of the basicInfo of this HealthProfessional object.
    public String getBasicInfo() {
        return basicInfo;
    }

    // Setter method for the basicInfo variable.
    // It enables other parts of the program to change the value of the basicInfo of this HealthProfessional object if needed.
    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }
}

public class LoanApplication {
    private String identification;
    private String proofOfIncome;
    private String creditHistory;
    private String employmentDetails;
    private String applicationType;
    private boolean isValid;

    public LoanApplication(String identification, String proofOfIncome, String creditHistory, String employmentDetails, String applicationType) {
        this.identification = identification;
        this.proofOfIncome = proofOfIncome;
        this.creditHistory = creditHistory;
        this.employmentDetails = employmentDetails;
        this.applicationType = applicationType;
        this.isValid = false;
    }

    public void submitApplication() {
        if (isValidInput()) {
            isValid = true;
            System.out.println("Loan application submitted successfully!");
        } else {
            System.out.println("Invalid input. Please check your submitted details.");
        }
    }

    private boolean isValidInput() {
        // Add validation logic here based on acceptance criteria
        // For example, checking if all required fields are provided
        return !identification.isEmpty() && !proofOfIncome.isEmpty() && !creditHistory.isEmpty() && !employmentDetails.isEmpty();
    }

    public String getApplicationType() {
        return applicationType;
    }

    public boolean isValid() {
        return isValid;
    }

    public static void main(String[] args) {
        // Example usage of the class
        LoanApplication application = new LoanApplication("1234567890", "Proof of income", "Good credit history", "Employment details", "Website");
        application.submitApplication();
        System.out.println("Application Type: " + application.getApplicationType());
        System.out.println("Application Valid: " + application.isValid());
    }
}

public class Main {
    public static void main(String[] args) {
        String password = "supersecret123";
        String apiKey = "12345-abcde-67890-fghij";
        String awsAccessKeyId = "AKIAIOSFODNN7EXAMPLE";
        String awsSecretKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
        String dbConnectionString = "jdbc:mysql://username:password@localhost:3306/mydb";

        System.out.println("Sensitive information for testing Gitleaks:");
        System.out.println("Password: " + password);
        System.out.println("API Key: " + apiKey);
        System.out.println("AWS Access Key ID: " + awsAccessKeyId);
        System.out.println("AWS Secret Key: " + awsSecretKey);
        System.out.println("DB Connection String: " + dbConnectionString);
    }
}

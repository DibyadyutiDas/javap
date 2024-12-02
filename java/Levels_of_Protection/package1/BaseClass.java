package package1;

public class BaseClass {
    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field"; // Default access
    private String privateField = "Private Field";

    public void displayFields() {
        System.out.println("Public: " + publicField);
        System.out.println("Protected: " + protectedField);
        System.out.println("Default: " + defaultField);
        System.out.println("Private: " + privateField);
    }
}

// Main Class
public class AccessSpecifierExample {

    public static void main(String[] args) {
        // 1. Access Specifiers (Public and Private)
        AccessSpecifierDemo demo = new AccessSpecifierDemo();
        System.out.println("Public Variable: " + demo.publicVariable);
        System.out.println("Private Variable (via Getter): " + demo.getPrivateVariable());

        // Modify private variable using public method
        demo.setPrivateVariable("Updated Private Value");
        System.out.println("Updated Private Variable (via Getter): " + demo.getPrivateVariable());

        // 2. Primitive Data Types (Pass by Value)
        int primitiveValue = 10;
        System.out.println("\nPrimitive Value (Before): " + primitiveValue);
        modifyPrimitive(primitiveValue);
        System.out.println("Primitive Value (After): " + primitiveValue);

        // 3. Objects (Pass by Reference)
        DataObject obj = new DataObject(20);
        System.out.println("\nObject Value (Before): " + obj.getValue());
        modifyObject(obj);
        System.out.println("Object Value (After): " + obj.getValue());

        // 4. Final Keyword
        final int constantValue = 100;
        System.out.println("\nFinal Variable: " + constantValue);
        // Uncommenting the next line will cause a compilation error
        // constantValue = 200; // Final variables cannot be reassigned
    }

    // Method to demonstrate pass by value
    public static void modifyPrimitive(int value) {
        value = value * 2; // Does not affect the original value
    }

    // Method to demonstrate pass by reference
    public static void modifyObject(DataObject obj) {
        obj.setValue(obj.getValue() * 2); // Affects the original object
    }
}

// Access Specifier Demo Class
class AccessSpecifierDemo {
    // Public variable (accessible anywhere)
    public String publicVariable = "I am Public";

    // Private variable (accessible only within this class)
    private String privateVariable = "I am Private";

    // Getter for private variable
    public String getPrivateVariable() {
        return privateVariable;
    }

    // Setter for private variable
    public void setPrivateVariable(String value) {
        privateVariable = value;
    }
}

// Data Object Class
class DataObject {
    private int value;

    public DataObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

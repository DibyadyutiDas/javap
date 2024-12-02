package package2;

import package1.BaseClass;

public class SubClass extends BaseClass {
    public void accessFields() {
        System.out.println("From SubClass (Different Package):");
        System.out.println("Public: " + publicField);
        System.out.println("Protected: " + protectedField); // Accessible in a subclass
        // System.out.println("Default: " + defaultField);   // Not accessible
        // System.out.println("Private: " + privateField);   // Not accessible
    }
}

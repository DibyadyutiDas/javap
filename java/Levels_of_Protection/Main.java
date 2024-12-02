import package1.BaseClass;
import package1.SamePackageClass;
import package2.SubClass;

public class Main {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        System.out.println("Accessing Fields Directly from Main:");
        System.out.println("Public: " + base.publicField);
        // System.out.println("Protected: " + base.protectedField); // Not accessible
        // System.out.println("Default: " + base.defaultField);     // Not accessible
        // System.out.println("Private: " + base.privateField);     // Not accessible

        SamePackageClass samePackage = new SamePackageClass();
        samePackage.accessFields();

        SubClass subClass = new SubClass();
        subClass.accessFields();
    }
}

package package1;

public class SamePackageClass {
    public void accessFields() {
        BaseClass base = new BaseClass();
        System.out.println("From SamePackageClass:");
        System.out.println("Public: " + base.publicField);
        System.out.println("Protected: " + base.protectedField);
        System.out.println("Default: " + base.defaultField);
        // System.out.println("Private: " + base.privateField); // Not accessible
    }
}

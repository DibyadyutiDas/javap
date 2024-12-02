public class BoxingandUnboxing {

    public static void main(String[] args) {
        // Boxing: Primitive to Wrapper Object
        int primitiveValue = 100; // Primitive type
        Integer boxedValue = Integer.valueOf(primitiveValue); // Explicit Boxing
        Integer autoBoxedValue = primitiveValue; // Auto-Boxing
        System.out.println("Primitive Value: " + primitiveValue);
        System.out.println("Boxed Value (Explicit): " + boxedValue);
        System.out.println("Auto-Boxed Value: " + autoBoxedValue);

        // Unboxing: Wrapper Object to Primitive
        Integer wrapperObject = Integer.valueOf(200); // Wrapper Object
        int unboxedValue = wrapperObject.intValue(); // Explicit Unboxing
        int autoUnboxedValue = wrapperObject; // Auto-Unboxing
        System.out.println("\nWrapper Object: " + wrapperObject);
        System.out.println("Unboxed Value (Explicit): " + unboxedValue);
        System.out.println("Auto-Unboxed Value: " + autoUnboxedValue);

        // Arithmetic operation using Auto-Boxing and Auto-Unboxing
        Integer num1 = 50; // Auto-Boxing
        Integer num2 = 30; // Auto-Boxing
        int sum = num1 + num2; // Auto-Unboxing during arithmetic operation
        System.out.println("\nSum of " + num1 + " and " + num2 + " (Auto-Unboxed): " + sum);
    }
}
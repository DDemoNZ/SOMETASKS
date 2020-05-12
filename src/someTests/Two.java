package someTests;

public interface Two {
    default void method() {
        System.out.println("One");
    }
}

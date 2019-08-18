package java9.privatemethods;

public interface PrivateMethodInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("I am a default method");
        privateStaticMethod(); //private static can not accessed from static and non static
    }

    static void staticMethod() {
        System.out.println("I am a static method");
        privateStaticMethod();
    }

    private void privateMethod() {
        System.out.println("I am a private method");
        privateStaticMethod();
    }

    private static void privateStaticMethod() {
        System.out.println("I am a private static method");
        //can not access private non static from here
    }
}

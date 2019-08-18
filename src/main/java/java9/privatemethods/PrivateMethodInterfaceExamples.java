package java9.privatemethods;

/*
    Good article : https://howtodoinjava.com/java9/java9-private-interface-methods/
 */
public class PrivateMethodInterfaceExamples implements PrivateMethodInterface {
    @Override
    public void abstractMethod() {
        System.out.println("I am an abstract method");
    }

    public static void main(String[] args) {
        PrivateMethodInterface privateMethodInterface = new PrivateMethodInterfaceExamples();
        privateMethodInterface.abstractMethod();
        privateMethodInterface.defaultMethod();
        PrivateMethodInterface.staticMethod();
    }
}

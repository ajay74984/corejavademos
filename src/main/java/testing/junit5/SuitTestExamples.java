package testing.junit5;

//@RunWith(JUnitPlatform.class)
//@SelectPackages("com.baeldung")
public class SuitTestExamples {}
//@SelectPackage is used to specify the names of packages to be selected when running a test suite.
// In our example, it will run all test. The second annotation, @SelectClasses, is used to specify the classes to be selected when running a test suite:


//@RunWith(JUnitPlatform.class)
//@SelectClasses({AssertionTest.class, AssumptionTest.class, ExceptionTest.class})
class AllTests {}
//For example, above class will create a suite contains three test classes.
// Please note that the classes don't have to be in one single package.
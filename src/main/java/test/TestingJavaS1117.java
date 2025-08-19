package test;

public class TestingJavaS1117 {

  private String myVariable = "something";

  private static final String MORE = "more";

  public String anotherMethod(String input) {
    if (input.contains("something")) {
      myVariable += MORE;
      return myVariable;
    }
    return "Nothing";
  }

  public String someMethod(String input) {
    String myVariable = "myVariable";
    if (input.contains(MORE)) {
      myVariable += MORE;
    }
    return myVariable;
  }

  public String moreMethod(String input) {
    String myVariable = "local"; // Shadows the field 'myVariable'
    if (input == null) {
      return null;
    }
    int unused = 42; // Unused variable
    if (input.length() > 5) {
      return myVariable + input.substring(10); // Possible StringIndexOutOfBoundsException
    }
    return myVariable;
  }
}

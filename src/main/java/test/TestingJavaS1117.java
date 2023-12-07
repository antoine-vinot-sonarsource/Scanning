package test;

public class TestingJavaS1117 {

  private static final String MORE = "more";

  public String someMethod(String input) {
    String myVariable = "myVariable";
    if (input.contains(MORE)) {
      myVariable += MORE;
    }
    return myVariable;
  }
}

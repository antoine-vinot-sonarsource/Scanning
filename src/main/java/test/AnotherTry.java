package test;

public class AnotherTry {

  String var = "var";

  public AnotherTry() {
    var = "var";
  }

  public String aVar() {
    String var = "bla";
    if (var.contains("bla")) {
      var += "bla";
    }
    return var;
  }
}

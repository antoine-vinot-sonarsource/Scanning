package test;

public class EmailCaseSensitive {
  private String email;
  public EmailCaseSensitive(String email) {
    this.email = email;
  }

  public String somethingElse() {
    String email = "email";
    if (email.contains("somethingElse")) {
      email += "more";
    }
    return email;
  }

  public String something() {
    String email = "email";
    if (email.contains("something")) {
      email += "more";
    }
    return email;
  }

  public String getEmail() {
    if (true) {
      return email;
    }
    return email;
  }
}

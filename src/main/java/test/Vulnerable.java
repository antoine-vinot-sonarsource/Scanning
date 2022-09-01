package test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Vulnerable {
  public void myVulnerability() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void myVulnerability2() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}

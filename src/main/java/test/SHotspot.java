package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SHotspot {

  public void test() throws SQLException {
    String username = "steve";
    String password = "blue";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
      "user=" + username + "&password=" + password); // Sensitive
  }

}

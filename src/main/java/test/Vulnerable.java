package test;

import java.nio.file.Path;
import java.nio.file.Paths;
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

  public void myVulnerability3() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void myVulnerability4() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private Path taintVulnerability(final String fileName) { //fileName is user controlled
    Path parentPath = Paths.get("notUserControlledParameters");
    Path requestedFilePath = Paths.get("notUserControlledParameters", fileName);
    // security check against hacks like passing '../filename'
    if ( ! parentPath.equals( requestedFilePath.getParent() ) ) {
      throw new IllegalArgumentException("");
    }
    return requestedFilePath;
  }
}

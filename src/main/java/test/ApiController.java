package test;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApiController {
  public static String targetDirectory = "/path/to/target/directory/";

  @GetMapping(value = "/delete")
  public void delete(@RequestParam("filename") String filename) throws IOException {

    File file = new File(targetDirectory + filename);
    file.delete();
  }

  private void myVulnerability() {
    try {
      DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", "");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}

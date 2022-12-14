package test;

import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApiController
{
  static private String targetDirectory = "/path/to/target/directory/";

  @GetMapping(value = "/delete")
  public void delete(@RequestParam("filename") String filename) throws IOException {

    File file = new File(targetDirectory + filename);
    file.delete();
  }
}

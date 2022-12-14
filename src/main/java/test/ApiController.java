package test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController
{
  @GetMapping(value = "/endpoint")
  public String endpoint(@RequestParam("input") String input)
  {
    return input;
  }
}

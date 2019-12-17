package site.lengyue.lolsolo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

  @GetMapping("/hello")
  public String helloWorld(){
    System.out.println("ssssssssss");
    return "hello";
  }
}

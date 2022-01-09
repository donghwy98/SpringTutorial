package hello.springmvc.basic.requestmapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
@RestController
public class MappingController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @RequestMapping("/hello-basic")
    public String helloBasic(){
        log.info("helloBasic");
        return "경기대박서준";
    }

    @GetMapping("/mapping/names/{name}/ages/{age}")
    public String mappingPath(@PathVariable String name, @PathVariable int age) {
        log.info("mappingPath name={}, age={}", name, age);
        return "경기대박서준";
    }
}

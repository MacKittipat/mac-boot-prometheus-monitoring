package mac.kittipat.monitoring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users")
    public String getUser(@RequestParam Integer id) throws Exception {
        log.info("Finding user. id={}", id);

        if(id == 6) {
            throw new Exception("User " + id + " does not exist");
        }
        return "User " + id;
    }
}



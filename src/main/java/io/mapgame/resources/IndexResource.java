package io.mapgame.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexResource {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }



}

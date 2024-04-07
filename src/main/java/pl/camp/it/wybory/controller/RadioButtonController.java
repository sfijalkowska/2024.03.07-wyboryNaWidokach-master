package pl.camp.it.wybory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RadioButtonController {

    @RequestMapping(value = "/radio", method = RequestMethod.GET)
    public String radio() {
        return "radio";
    }

    @RequestMapping(value = "/radio", method = RequestMethod.POST)
    public String radio(@RequestParam String param1) {
        System.out.println(param1);
        return "redirect:/radio";
    }
}

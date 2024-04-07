package pl.camp.it.wybory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckBoxController {

    @RequestMapping(value = "/checkbox", method = RequestMethod.GET)
    public String checkbox() {
        return "checkbox";
    }

    @RequestMapping(value = "/checkbox", method = RequestMethod.POST)
    public String checkbox(@RequestParam(required = false) String param1) {
        System.out.println(param1);
        return "redirect:/checkbox";
    }

    @RequestMapping(value = "/checkbox2", method = RequestMethod.GET)
    public String checkbox2() {
        return "checkbox2";
    }

    @RequestMapping(value = "/checkbox2", method = RequestMethod.POST)
    public String checkbox2(@RequestParam(required = false, defaultValue = "false") boolean isPresent) {
        System.out.println(isPresent);
        return "redirect:/checkbox2";
    }
}

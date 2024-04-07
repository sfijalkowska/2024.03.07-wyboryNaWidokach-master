package pl.camp.it.wybory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.camp.it.wybory.model.ModelClass;

@Controller
public class SelectController {

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String select() {
        return "select";
    }

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    public String select(@RequestParam String wybor) {
        System.out.println(wybor);
        return "redirect:/select";
    }

    @RequestMapping(value = "/select2", method = RequestMethod.GET)
    public String select2(Model model) {
        model.addAttribute("model", new ModelClass());
        return "select2";
    }

    @RequestMapping(value = "/select2", method = RequestMethod.POST)
    public String select2(@ModelAttribute ModelClass modelClass) {
        System.out.println(modelClass.getSelect());
        return "redirect:/select2";
    }


}

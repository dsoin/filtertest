package com.dsoin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dsoin on 08/02/17.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test(@RequestAttribute String filteredName, @RequestParam String name, ModelMap model) {
    model.addAttribute("message", name);
        return "test";
    }
}

package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    Map<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
            events.put("Coding and Cocktails", "Drink and learn to code.");
            events.put("LaunchCode", "Learn coding for free, two nights a week!");
            events.put("Kansas City Women in Technology", "Meet other women in technology careers.")
        return "events/index";
    }

}

package shosta.vlada.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Igor Hnes on 6/20/17.
 */
@Controller
@RequestMapping("/events")
public class EventController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getEvents(ModelMap map) {
        return "My Events";
    }
}

package guru.springframework.spring5jokesappv2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import guru.springframework.spring5jokesappv2.services.JokeService;


@Controller
public class JokesController {
    private final JokeService jokeService;

    
    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }



    @RequestMapping(value={"/", ""}, method=RequestMethod.GET)
    public String getJoke(Model model) {
        model.addAttribute("joke",  jokeService.getJoke());
        return "index";
    }
    
}

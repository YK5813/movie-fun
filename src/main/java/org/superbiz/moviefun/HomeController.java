package org.superbiz.moviefun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    MoviesBean moviesBean = null;
    List<Movie> movies = null;

    public HomeController(MoviesBean moviesBean) {
        this.moviesBean = moviesBean;
    }

    @GetMapping("/setup")
    public String setup(Map<String, Object> model){
        model.put("movies", moviesBean.getMovies());
        return "setup";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}

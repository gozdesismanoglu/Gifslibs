package com.example.GifsLib.Controller;


import com.example.GifsLib.data.GifsRepository;
import com.example.GifsLib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifsController {
    @Autowired
    private GifsRepository gifsRepository;
    @RequestMapping("/")
    public String GifsList(ModelMap modelmap) {
        List<Gif> allGifs=gifsRepository.getAllGifs();
        modelmap.put("gifs", allGifs);
        return "home";
    }
    @RequestMapping("/gif/{name}")
    public String GifDetails(@PathVariable String name, ModelMap modelmap){
        Gif gif=gifsRepository.findByName(name);
        modelmap.put("gif",gif);
        return "gif-details";}


}

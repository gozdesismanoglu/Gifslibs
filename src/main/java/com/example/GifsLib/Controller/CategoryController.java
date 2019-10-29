package com.example.GifsLib.Controller;


import com.example.GifsLib.data.CategoryRepository;
import com.example.GifsLib.data.GifsRepository;
import com.example.GifsLib.model.Category;
import com.example.GifsLib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    public CategoryRepository categoryRepository;
    @Autowired
    public GifsRepository gifsRepository;
    @RequestMapping("/categories")
    public String listOfCategories(ModelMap modelmap){
        List<Category> ALL_CAT=categoryRepository.getAllCategories();
        modelmap.put("categories",ALL_CAT );
        return "categories";
    }
    @RequestMapping("/category/{id}")
    public String category(ModelMap modelMap,@PathVariable int id){
        Category category=categoryRepository.findById(id);
        modelMap.put("category",category);
        List <Gif> gifs= gifsRepository.findByCategoryId(id);
        modelMap.put("gifs",gifs);
        return "category";

    }


}

package com.example.GifsLib.data;

import com.example.GifsLib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES= Arrays.asList(
            new Category(1, "Fun"),
            new Category(2,"Ugly"),
            new Category(3,"New")
    );

    public List<Category>getAllCategories(){
        return ALL_CATEGORIES;
    }
    public Category findById(int id){
        for(Category category: ALL_CATEGORIES) {
            if (category.getId()==id) {
                return category;
            }
        }
        return null;
    }
}

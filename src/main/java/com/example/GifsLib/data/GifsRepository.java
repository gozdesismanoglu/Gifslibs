package com.example.GifsLib.data;

import com.example.GifsLib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class GifsRepository {

    public static final List<Gif> ALL_GIFS= Arrays.asList(
            new Gif("compiler-bot",1,LocalDate.of(2019, 2, 13), "Gözde Sismanoglu", true),
            new Gif("android-explosion", 2,LocalDate.of(2019, 3, 15), "Furkan Kocer", false),
            new Gif("ben-and-mike",3, LocalDate.of(2019, 4, 20), "Mehmet Ali", true),
            new Gif("book-dominos",1, LocalDate.of(2019, 4, 10), "Cem Cebi", false),
            new Gif("cowboy-coder", 2,LocalDate.of(2019, 4, 10), "Hazal", false),
            new Gif("infinite-andrew", 3,LocalDate.of(2018, 4, 10), "Sena", true)

    );

    public Gif findByName(String name){
        for(Gif gif: ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
            return null;
    }

    public List<Gif> findByCategoryId(int id){
        List <Gif> gifs=new ArrayList<>();
        for(Gif gif: ALL_GIFS) {
            if (gif.getCategoryId()==id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }
}

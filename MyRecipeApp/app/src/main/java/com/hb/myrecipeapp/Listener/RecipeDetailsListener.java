package com.hb.myrecipeapp.Listener;


import com.hb.myrecipeapp.Models.Recipe;
import com.hb.myrecipeapp.Models.RecipeDatailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDatailsResponse response, String message);
    void didError(String message);

}

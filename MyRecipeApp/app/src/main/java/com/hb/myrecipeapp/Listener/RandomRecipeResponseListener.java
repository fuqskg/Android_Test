package com.hb.myrecipeapp.Listener;

import com.hb.myrecipeapp.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}

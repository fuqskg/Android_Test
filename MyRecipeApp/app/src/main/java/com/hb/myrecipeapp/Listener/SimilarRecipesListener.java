package com.hb.myrecipeapp.Listener;

import com.hb.myrecipeapp.Adapters.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarRecipeResponse> responses, String message);
    void didError(String message);
}

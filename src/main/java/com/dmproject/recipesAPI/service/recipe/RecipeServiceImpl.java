package com.dmproject.recipesAPI.service.recipe;


import com.dmproject.recipesAPI.entity.Recipe;
import com.dmproject.recipesAPI.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public ResponseEntity<Recipe> create(Recipe recipe) {

        recipeRepository.save(recipe);
        return ResponseEntity.ok(recipe);
    }

    @Override
    public List<Recipe> findAll(Recipe recipe) {

        return recipeRepository.findAll();

    }

    @Override
    public ResponseEntity<Recipe> getById(Long id) {
        Optional<Recipe> recipeOpt = recipeRepository.findById(id);

        // Se puede hacer funcional
        if (recipeOpt.isPresent())
            return ResponseEntity.ok(recipeOpt.get());
        else
            return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Recipe> update(Long id, Recipe recipe) {
        Optional<Recipe> recipeOpt = recipeRepository.findById(id);

        if (recipeOpt.isPresent()) {

            recipeOpt.get().setTitle(recipe.getTitle());
            recipeOpt.get().setDescription(recipe.getDescription());
            recipeOpt.get().setTimeCook(recipe.getTimeCook());
            recipeOpt.get().setServes(recipe.getServes());
            recipeOpt.get().setImageUrl(recipe.getImageUrl());
            recipeOpt.get().setDifficulty(recipe.getDifficulty());
            recipeOpt.get().setIngredients(recipe.getIngredients());
            recipeOpt.get().setInstruction(recipe.getInstruction());
            recipeOpt.get().setCategory(recipe.getCategory());
            recipeRepository.save(recipeOpt.get());

            return ResponseEntity.ok(recipeOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<Recipe> delete(Long id) {
        Optional<Recipe> recipeOpt = recipeRepository.findById(id);

        if (recipeOpt.isPresent()) {

            recipeRepository.delete(recipeOpt.get());
            return ResponseEntity.ok(recipeOpt.get());

        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

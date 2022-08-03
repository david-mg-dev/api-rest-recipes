package com.dmproject.recipesAPI.controller;


import com.dmproject.recipesAPI.entity.Recipe;
import com.dmproject.recipesAPI.repository.RecipeRepository;
import com.dmproject.recipesAPI.service.recipe.RecipeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    private final RecipeServiceImpl recipeService;


    public RecipeController(RecipeServiceImpl recipeService) {

        this.recipeService = recipeService;
    }


    /**
     * Endpoint list All recipe
     * http://localhost/api/recipe
     * @param recipe
     * @return
     */
    @GetMapping("/api/recipe")
    public List<Recipe> findAll(Recipe recipe) {

        return recipeService.findAll(recipe);
    }

    /**
     * Endpoint list recipe By Id
     * http://localhost/api/recipe
     * @param id
     * @return
     */
    @GetMapping("/api/recipe/{id}")
    public ResponseEntity<Recipe> getById(@PathVariable Long id) {

        return recipeService.getById(id);
    }


    /**
     * Endpoint create recipe
     * http://localhost/api/recipe
     * @param recipe
     * @return
     */
    @PostMapping("/api/recipe")
    public ResponseEntity<Recipe> create(@RequestBody Recipe recipe){

        return recipeService.create(recipe);
    }

    /**
     * Endpoint update recipe
     * http://localhost/api/recipe/id
     * @param id
     * @param recipe
     * @return
     */
    @PutMapping("/api/recipe/{id}")
    public ResponseEntity<Recipe> update(@PathVariable Long id, @RequestBody Recipe recipe){

        return recipeService.update(id, recipe);
    }

    /**
     * Endpoint delete recipe
     * http://localhost/api/recipe/id
     * @param id
     * @return
     */
    @DeleteMapping("/api/recipe/{id}")
    public ResponseEntity<Recipe> delete(@PathVariable Long id) {

        return recipeService.delete(id);
    }
}

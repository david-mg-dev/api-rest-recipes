package com.dmproject.recipesAPI.repository;

import com.dmproject.recipesAPI.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {


}

package com.dmproject.recipesAPI.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "recipes")
@Getter @Setter @NoArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String timeCook;

    private Integer serves;

    private String imageUrl;

    private String difficulty;

    private String ingredients;

    private String instruction;


    public Recipe(Long id, String title, String description, String timeCook, Integer serves, String imageUrl, String difficulty, String ingredients, String instruction) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timeCook = timeCook;
        this.serves = serves;
        this.imageUrl = imageUrl;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.instruction = instruction;
    }


}



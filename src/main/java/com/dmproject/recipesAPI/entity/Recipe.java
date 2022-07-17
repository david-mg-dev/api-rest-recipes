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

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String timeCook;

    @Column
    private Integer serves;

    @Column
    private String imageUrl;

    @Column
    private String difficulty;

    @Column
    private String ingredients;

    @Column
    private String instruction;

    @Column
    private String category;


    public Recipe(Long id, String title, String description, String timeCook, Integer serves, String imageUrl, String difficulty, String ingredients, String instruction, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timeCook = timeCook;
        this.serves = serves;
        this.imageUrl = imageUrl;
        this.difficulty = difficulty;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.category = category;
    }


}



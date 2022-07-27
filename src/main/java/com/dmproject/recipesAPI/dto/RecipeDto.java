package com.dmproject.recipesAPI.dto;


import lombok.Data;

import java.util.Date;

@Data
public class RecipeDto {

    private Long id;

    private String tittle;

    private String description;

    private String timeCook;

    private Integer serves;

    private String imageUrl;

    private String difficulty;

    private String ingredients;

    private String instruction;

    private String category;

    private Date dateCreate;
}

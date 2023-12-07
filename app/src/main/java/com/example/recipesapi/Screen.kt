package com.example.recipesapi

sealed class Screen(val route: String) {
    object RecipeScreen:Screen("recipeScr")
    object DetailsScreen:Screen("detailScr")
}
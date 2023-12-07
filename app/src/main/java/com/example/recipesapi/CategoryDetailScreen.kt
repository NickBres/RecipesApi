package com.example.recipesapi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailScreen(category: Category) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = category.strCategory,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = category.strCategoryDescription,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            ),
            textAlign = TextAlign.Justify,
            modifier = Modifier.verticalScroll(rememberScrollState())
        )
    }
}
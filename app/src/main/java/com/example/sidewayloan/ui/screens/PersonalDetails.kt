package com.example.sidewayloan.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BirthdayField() {
    OutlinedTextField(
        label = { Text(text = "Birthday") },
        value = "",
        onValueChange = {}
    )
}

@Preview
@Composable
fun PersonalDetails() {
    Column {
        BirthdayField()
    }
}
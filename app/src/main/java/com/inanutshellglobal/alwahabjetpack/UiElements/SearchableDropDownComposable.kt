package com.inanutshellglobal.alwahabjetpack.UiElements

import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchableDropDown() {
    val moviesList = listOf(
        "Iron Man",
        "Thor: Ragnarok",
        "Captain America: Civil War",
        "Doctor Strange",
        "The Incredible Hulk",
        "Ant-Man and the Wasp"
    )
    var expanded by remember { mutableStateOf(false) }
    var textFieldValue by remember { mutableStateOf("") }

    // container for textfield and menu
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = {
            expanded = !expanded
        }
    ) {
        // textfield
        TextField(
            modifier = Modifier
                .menuAnchor(), // menuAnchor modifier must be passed to the text field for correctness
            value = textFieldValue,
            onValueChange = { newValue ->
                textFieldValue = newValue
            },
            label = { Text("Movies") },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
        )

        // filter options based on text field value
        val filteringOptions = moviesList.filter { it.contains(textFieldValue, ignoreCase = true) }
        if (filteringOptions.isNotEmpty()) {
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
            ) {
                filteringOptions.forEach { selectedMovie_ ->
                    DropdownMenuItem(
                        text = { Text(selectedMovie_) },
                        onClick = {
                            textFieldValue = selectedMovie_
                            expanded = false
                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                    )
                }
            }
        }
    }
}
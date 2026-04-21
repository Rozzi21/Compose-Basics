package com.example.compose_basics.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_basics.R


@Composable
fun EditTextExample( modifier: Modifier = Modifier) {

    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange={ text = it},
        label = { Text("Ini adalah teks Outline")},
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Black
        )
    )
}

@Composable
fun NotOutlinedEditTextExample( modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("")}

    TextField(
        value = text,
        onValueChange = {text = it},
        label = {Text(stringResource(id = R.string.sample))},
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 16.dp),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Blue,
            unfocusedIndicatorColor = Color.Black
        )
    )
}

@Composable
fun ButtonWithIcon() {

    var showDialog by remember { mutableStateOf(false) }

    Button(onClick = { showDialog = true}) {
        Icon(
            painter = painterResource(id = R.drawable.ic_for_first_button_24),
            contentDescription = stringResource(id = R.string.button_text),
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.button_smile),
            modifier = Modifier.padding(start = 10.dp))
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {showDialog = false},
            title = {
                Text("Tetaplah tersenyum dan bahagia")
            },
            text = {
                Text("Smiley sudah menyapamu")
            },
            confirmButton = {
                Button(onClick = {showDialog = false}) {
                    Text("Baybay")
                }
            }
        )

    }
}

@Preview(showBackground = true)
@Composable
fun UIElementsPreview() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(start = 12.dp, end = 12.dp)
    ) {
        EditTextExample()
    }
}












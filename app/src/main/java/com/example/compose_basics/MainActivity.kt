package com.example.compose_basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.compose_basics.component.EditTextExample
import com.example.compose_basics.component.NotOutlinedEditTextExample
import com.example.compose_basics.ui.theme.ComposeBasicsTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(16.dp)
                    ) {

                        EditTextExample(
                        )
                        NotOutlinedEditTextExample(
                        )
                    }
                }
            }
        }
    }
}

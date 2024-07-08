package com.example.note_app.core.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgs
import androidx.navigation.navArgument
import com.example.note_app.core.feature_note.domain.util.Screen
import com.example.note_app.core.feature_note.presentation.add_edit_note.AddEditNoteScreen
import com.example.note_app.core.feature_note.presentation.notes.components.NotesScreen
import com.example.note_app.core.theme.Note_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Note_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.NotesScreen.route
                    ){
                        composable(route = Screen.NotesScreen.route)
                        {
                            NotesScreen(navController = navController)
                        }
                        composable(
                            route = Screen.AddEditNoteScreen.route +
                                    "?noteId={noteId}&noteColor={noteColor}",
                            arguments =  listOf(
                                navArgument(
                                    name = "noteColor"
                                ){
                                    type = NavType.IntType
                                    defaultValue = -1
                                }
                                    navArgument(
                                      name = "noteId"
                                    ){
                                    type = NavType.IntType
                                    defaultValue = -1
                                },
                            )
                        ){
                            val color = it.arguments?.getInt("noteColor") ?: -1
                            AddEditNoteScreen(
                                navController = navController,
                                noteColor = color
                            )
                        }
                    }
                }
            }
        }
    }
}

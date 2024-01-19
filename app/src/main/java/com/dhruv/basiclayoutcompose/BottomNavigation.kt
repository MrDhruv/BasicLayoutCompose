package com.dhruv.basiclayoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Settings

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dhruv.basiclayoutcompose.ui.theme.BasicLayoutComposeTheme



class BottomNavigation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowBottomNavigation()
                }
            }
        }
    }
}

@Composable
fun ShowBottomNavigation(modifier: Modifier=Modifier){
    NavigationBar(containerColor = MaterialTheme.colorScheme.surfaceVariant,
        modifier=modifier) {
         NavigationBarItem(selected = true,
             onClick = { /*TODO*/ },
             icon = {
                    Icon( imageVector = Icons.Default.Settings,
                        contentDescription =null )
                },
             label = { Text(text=stringResource(R.string.settings))}
         )

        NavigationBarItem(selected = false,
            onClick = { /*TODO*/ },
            icon = { Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription =null ) },
            label = { Text(text = stringResource(R.string.profile))}
            )


    }
}


@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
    BasicLayoutComposeTheme {
      ShowBottomNavigation()
    }
}
package com.dhruv.basiclayoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
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



class LeftNavigation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   ShowLeftNavigationBar()
                }
            }
        }
    }
}
@Composable
fun ShowLeftNavigationBar(modifier: Modifier=Modifier){
    BasicLayoutComposeTheme {
        NavigationRail(modifier = modifier.padding(start = 8.dp,end=8.dp),
            containerColor = MaterialTheme.colorScheme.background) {
            Column(modifier = modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                NavigationRailItem(selected = true,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = Icons.Default.Settings, contentDescription =null ) },
                    label = { Text(stringResource(id = R.string.settings))}
                )
                Spacer(modifier = modifier.height(8.dp))
                NavigationRailItem(selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription =null ) },
                    label = { Text(stringResource(id = R.string.profile))})
            }

        }
    }

}

@Composable
fun  LandScapeUI(){
    Row {
        ShowLeftNavigationBar()
        HomeScreen()
    }
}


@Preview(showBackground = true)
@Composable
fun LeftNavigationPreview() {
    BasicLayoutComposeTheme {
  // LandScapeUI()
        AlignYourBodyElement(
            R.drawable.ab1_inversions,
            R.string.abl_inversions,
            Modifier.padding(8.dp))
    }
}
package com.dhruv.basiclayoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dhruv.basiclayoutcompose.ui.theme.BasicLayoutComposeTheme



class CardImageTextHorizontal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FavouriteCollectionCard(
                        R.drawable.ab1_inversions,
                        R.string.abl_inversions,
                        Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun FavouriteCollectionCard(@DrawableRes drawable:Int,
                         @StringRes text:Int,
                         modifier: Modifier){
    Surface(
        shape = MaterialTheme.shapes.medium,
        color=MaterialTheme.colorScheme.surfaceVariant,
        modifier = modifier) {
        Row(
            verticalAlignment =Alignment.CenterVertically,
            modifier = modifier.width(255.dp)) {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = "",
                contentScale=ContentScale.Crop,
                modifier= modifier
                    .size(80.dp)
                    .clip(RectangleShape)
            )

            Text(
                text = stringResource(text),
                style=MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(horizontal = 16.dp))
        }
    }

}


@Preview(showBackground = true)
@Composable
fun CardImageTextHorizontalPreview() {
    BasicLayoutComposeTheme {
        FavouriteCollectionCard(
            R.drawable.ab1_inversions,
            R.string.abl_inversions,
            Modifier.padding(8.dp))
    }
}
package com.dhruv.basiclayoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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



class LazyHorizontalGridItem : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GridHorizontalfixedItem(noOfRow = 2, modifier =Modifier.padding(8.dp) , bodyDataList =getBodyData() )

                }
            }
        }
    }
}

@Composable
fun GridHorizontalfixedItem(noOfRow:Int,modifier: Modifier,bodyDataList:List<BodyData>){
    LazyHorizontalGrid(rows = GridCells.Fixed(noOfRow),
        contentPadding= PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier =modifier.height(318.dp) ){
            items(bodyDataList){
                bodyData->
                FavouriteCollectionCard(drawable = bodyData.yogaIcon,
                    text = bodyData.nameYoga,
                    modifier =modifier.height(80.dp) )
            }
    }
}



@Preview(showBackground = true)
@Composable
fun LazyHorizontalGridItemPreview() {
    BasicLayoutComposeTheme {
        GridHorizontalfixedItem(noOfRow = 2, modifier =Modifier.padding(8.dp) , bodyDataList =getBodyData() )
    }
}

fun getBodyData():List<BodyData> {
    val bodyDataList= mutableListOf<BodyData>()
    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))

    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions5))
    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))


    return bodyDataList
}
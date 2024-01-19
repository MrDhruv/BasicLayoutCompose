package com.dhruv.basiclayoutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dhruv.basiclayoutcompose.BodyData

import com.dhruv.basiclayoutcompose.ui.theme.BasicLayoutComposeTheme



class ListRowTextBelowImageCircle : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val bodyDataList= mutableListOf<BodyData>()
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
                    RowListItem(bodyDataList)
                }
            }
        }
    }
}

@Composable
fun RowListItem(bodyDataList:List<BodyData>){
 LazyRow(
     horizontalArrangement = Arrangement.spacedBy(8.dp),
     contentPadding = PaddingValues(16.dp)
 ){
       items(bodyDataList){
           bodyData-> BodyElement(
           bodyData.yogaIcon,
            bodyData.nameYoga,
           )
       }
     }
 
}
@Composable
fun BodyElement(@DrawableRes drawable:Int,
                         @StringRes text:Int,
                         ){
   Column(horizontalAlignment=Alignment.CenterHorizontally,
      ) {
       Image(painter = painterResource(id = drawable),
           contentDescription = "",
           contentScale=ContentScale.Crop,
           modifier= Modifier
               .size(88.dp)
               .clip(CircleShape)
       )

       Text(text = stringResource(text),
           modifier = Modifier.paddingFromBaseline(top=24.dp, bottom = 8.dp),
           style=MaterialTheme.typography.bodyMedium)
   }
}


@Preview(showBackground = true)
@Composable
fun ListRowTextBelowImageCirclePreview() {
    BasicLayoutComposeTheme {
        val bodyDataList= mutableListOf<BodyData>()
        bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
        bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
        bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
        bodyDataList.add(BodyData(R.drawable.ab1_inversions,R.string.abl_inversions))
        RowListItem(bodyDataList)
    }
}
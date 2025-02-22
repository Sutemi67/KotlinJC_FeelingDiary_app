package apc.appcradle.kotlinjc_feelingdiary_app.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import apc.appcradle.kotlinjc_feelingdiary_app.R

var mediumTextStyle = TextStyle(
    color = Color.Black,
    fontFamily = FontFamily(Font(R.font.comfortaa_regular)),
    textAlign = TextAlign.Center,
    fontSize = 15.sp
)
val titleTextStyle = TextStyle(
    fontFamily = FontFamily(Font(R.font.comfortaa_regular)),
    fontWeight = FontWeight.Normal,
    fontSize = 20.sp,
//    lineHeight = 28.sp,
//    letterSpacing = 0.sp
)
val labelTextStyle = TextStyle(
    fontFamily = FontFamily(Font(R.font.comfortaa_regular)),
    fontWeight = FontWeight.Light,
    fontSize = 12.sp,
    lineHeight = 14.sp,
    textAlign = TextAlign.Center
)

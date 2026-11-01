package com.example.kotlin_mirea_pr1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kotlin_mirea_pr1.ui.theme.Kotlin_mirea_pr1Theme
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin_mirea_pr1Theme {
                AppScreen()
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AppScreen() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = stringResource(R.string.app_name)) }
                )
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                InitialsContainer()
            }
        }
    }
}

@Composable
fun Hello(name: String?, modifier: Modifier = Modifier) {
    if (name != null) {
        Text(
            text = "Hello, $name!",
            modifier = modifier
        )
    } else {
        Text(
            text = "Имя не задано",
            modifier = modifier
        )
    }
}

@Preview(
    name = "Portrait",
    showSystemUi = true,
    showBackground = true,
    widthDp = 411,
    heightDp = 891
)
@Composable
fun HelloPortraitPreview() {
    Kotlin_mirea_pr1Theme {
        Hello(name = "Android")
    }
}

@Preview(
    name = "Landscape",
    showSystemUi = true,
    showBackground = true,
    device = "spec:shape=Normal,width=891dp,height=411dp"
)
@Composable
fun HelloLandscapePreview() {
    Kotlin_mirea_pr1Theme {
        Hello(name = "Android")
    }
}


@Preview(
    name = "Round",
    showSystemUi = true,
    showBackground = true,
    backgroundColor = 0xFFFFFF00L,
    device = "spec:shape=Round,width=200dp,height=200dp"
)
@Composable
fun HelloRoundPreview() {
    Kotlin_mirea_pr1Theme {
        Hello(name = "Android")
    }
}



// задание 3
@Preview(showBackground = true, name = "Style1")
@Composable
fun ComposeIntroPreview1() {
    Kotlin_mirea_pr1Theme {
        Text(
            text = stringResource(R.string.added_string),
            color = Color.Green,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, name = "Style2")
@Composable
fun ComposeIntroPreview2() {
    Kotlin_mirea_pr1Theme {
        Text(
            text = stringResource(R.string.added_string),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, name = "Style3")
@Composable
fun ComposeIntroPreview3() {
    Kotlin_mirea_pr1Theme {
        Text(
            text = stringResource(R.string.added_string),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 48.dp),
            style = TextStyle(
                fontSize = 24.sp,
                color = Color.Black,
                background = Color.Green,
                textDecoration = TextDecoration.Underline
            )
        )
    }
}
// задание 4

@Preview(
    name = "portrait",
    showSystemUi = true,
    showBackground = true,
    device = "spec:shape=Normal,width=411dp,height=891dp"
)
@Composable
fun ButtonPreview() {
    Kotlin_mirea_pr1Theme {
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 36.dp),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(2.dp, Color.Gray),
            elevation = ButtonDefaults.buttonElevation(
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            )
        ) {
            Text(text = "Нажми на меня")
        }
    }
}
// задание 5
@Composable
fun InitialsContainer() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxHeight()
                .aspectRatio(1f)
                .background(Color(0xFFFF9800), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "АБ", color = Color.Black)
        }
    }
}
@Preview(
    name = "portrait",
    showSystemUi = true,
    showBackground = true,
    device = "spec:shape=Normal,width=411dp,height=891dp"
)
@Composable
fun Task5Preview() {
    Kotlin_mirea_pr1Theme {
        Scaffold(
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                InitialsContainer()
            }
        }
    }
}
package dom.dima.learning.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dom.dima.learning.android.ui.theme.Sprint26HomeworkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactView(
                Contact(
//                    name = "Олег",
//                    surname = "Олегович",
//                    familyName = "Олегов",
//                    phone = "-",
//                    address = "г. Москва, 3-я улица Строителей, д. 25, кв. 15",
//                    email = "oleg@yemeyl.com",
//                    imageRes = R.drawable.photo

                    name = "Евгений",
                    surname = "Андреевич",
                    familyName = "Лукашин",
                    phone = "+7 495 495 95 95",
                    address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12",
                    email = "zhenya@yemeyl.com",
                    isFavorite = true
                )
            )

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sprint26HomeworkTheme {
        Greeting("Android")
    }
}
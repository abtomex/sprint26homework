package dom.dima.learning.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactDetails(
                Contact(
                    name = "Олег",
                    surname = "Олегович",
                    familyName = "Олегов",
                    phone = "-",
                    address = "г. Москва, 3-я улица Строителей, д. 25, кв. 15",
                    email = "oleg@yemeyl.com",
                    imageRes = R.drawable.photo
//
//                    name = "Евгений",
//                    surname = "Андреевич",
//                    familyName = "Лукашин",
//                    phone = "+7 495 495 95 95",
//                    address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12",
//                    email = "zhenya@yemeyl.com",
//                    isFavorite = true
                )
            )

        }
    }
}

@Composable
fun ContactDetails(contact: Contact) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.LightGray)

    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.25F),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            if (contact.imageRes != null) Image(
                modifier = Modifier.size(120.dp, 120.dp),
                painter = painterResource(contact.imageRes),
                contentDescription = stringResource(R.string.contact_photo)
            )

            else RoundInitials(
                style = MaterialTheme.typography.titleMedium,
                initials = contact.name.take(1).uppercase() + contact.familyName.take(n = 1).uppercase()
            )
            Text(
                style = MaterialTheme.typography.titleMedium,
                text = "${contact.name} ${contact.surname.orEmpty()}"
            )
            Row {
                Text(
                    style = MaterialTheme.typography.titleLarge,
                    text = contact.familyName
                )
                if (contact.isFavorite) Image(
                    modifier = Modifier.padding(start = 4.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(id = android.R.drawable.star_big_on),
                    contentDescription = null
                )

            }

        }
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(0.75F),
        ) {
            Text(
                modifier = Modifier.padding(start = 100.dp),
                text = "${stringResource(R.string.phone)}: ${contact.phone}"
            )
            Row(modifier = Modifier.padding(start = 80.dp).padding(top = 8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(text = stringResource(R.string.address) + ":")
                Text(modifier = Modifier
                    .padding(start = 16.dp)
                    .padding(end = 8.dp),
                    text = contact.address)
            }

            if (contact.email != null) Row(modifier = Modifier.padding(start = 80.dp).padding(top = 8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(text = stringResource(R.string.email) + ":")
                Text(modifier = Modifier
                    .padding(start = 16.dp)
                    .padding(end = 8.dp),
                    text = contact.email)
            }


        }
    }
}
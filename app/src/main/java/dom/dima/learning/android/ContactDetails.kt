package dom.dima.learning.android
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Preview(name = "portrait", showSystemUi = true)
@Composable
fun Contact1DetailsPreview() {
    ContactDetails(
        Contact(
            name = "Евгений",
//            surname = "Андреевич",
            familyName = "Лукашин",
            phone = "+7 495 495 95 95",
            address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12",
            email = "zhenya@yemeyl.com",
            isFavorite = true,
        )
    )
}

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun Contact2DetailsPreview() {
    ContactDetails(
        Contact(
            name = "Олег",
            surname = "Олегович",
            familyName = "Олегов",
            phone = "-",
            address = "г. Москва, 3-я улица Строителей, д. 25, кв. 15",
//            email = "oleg@yemeyl.com",
            imageRes = R.drawable.photo

        )
    )
}
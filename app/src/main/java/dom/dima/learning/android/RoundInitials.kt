package dom.dima.learning.android

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RoundInitials(initials: String, style: TextStyle) {
    Box(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(top = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(64.dp, 64.dp),
            painter = painterResource(id = R.drawable.circle),
            contentDescription = null,
        )
        Text(
            text = initials,
            style = style,
            fontSize = 24.sp
        )
    }
}

@Preview(name = "portrait", showSystemUi = true)
@Composable
fun RoundInitialsPreview() {
    RoundInitials("АБ", MaterialTheme.typography.titleMedium)
}

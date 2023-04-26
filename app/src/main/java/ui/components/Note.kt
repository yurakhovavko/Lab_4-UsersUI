package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.R
import com.topic2.android.notes.theme.rwGreen

@Composable
fun Note(){
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(rwGreen)
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = stringResource(id = R.string.header),
                maxLines = 1
            )
            Text(
                text = stringResource(id = R.string.content),
                maxLines = 1
            )
        }
        Checkbox(
            checked = false,
            onCheckedChange = {},
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview
@Composable

private fun NotePreview() { Note()
}
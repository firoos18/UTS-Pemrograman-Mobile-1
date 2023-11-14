package com.example.uts1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uts1.R

@Composable
fun ProfileCard(name : String) {
    Box(modifier = Modifier
        .clip(RoundedCornerShape(8.dp))
        .size(width = 375.dp, height = 115.dp)
        .background(Color.White),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Column {
                Text(text = name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = stringResource(id = R.string.uad), fontSize = 14.sp)
                Spacer(modifier = Modifier.size(8.dp))
                Row {
                    Button(onClick = {}, shape = RoundedCornerShape(8.dp)) {
                        Text(text = stringResource(id = R.string.beranda))
                    }
                    Spacer(modifier = Modifier.size(8.dp))
                    ElevatedButton(onClick = {}, shape = RoundedCornerShape(8.dp)) {
                        Text(text = stringResource(id = R.string.editProfile))
                    }
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )
            }
        }
    }
}
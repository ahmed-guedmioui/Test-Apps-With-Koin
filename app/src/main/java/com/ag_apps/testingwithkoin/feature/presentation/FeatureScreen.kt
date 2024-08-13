package com.ag_apps.testingwithkoin.feature.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.koin.androidx.compose.koinViewModel

/**
 * @author Ahmed Guedmioui
 */
@Composable
fun FeatureScreen(
    modifier: Modifier = Modifier,
    viewModel: FeatureViewModel = koinViewModel()
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = viewModel.stateData,
            fontSize = 26.sp
        )

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            modifier = Modifier.testTag(
                FeatureTestTags.BUTTON_GET_DATA_TYPE_1
            ),
            onClick = {
                viewModel.getData(1)
            }
        ) {
            Text(text = "Get Type 1")
        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            modifier = Modifier.testTag(
                FeatureTestTags.BUTTON_GET_DATA_TYPE_2
            ),
            onClick = {
                viewModel.getData(2)
            }
        ) {
            Text(text = "Get Type 2")
        }

    }
}
















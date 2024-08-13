package com.ag_apps.testingwithkoin.feature.presentation

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.ag_apps.testingwithkoin.core.presentation.MainActivity
import org.junit.Rule
import org.junit.Test
import org.koin.test.KoinTest


/**
 * @author Ahmed Guedmioui
 */
class FeatureScreenTest: KoinTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun clickButton1_isType1Displayed() {
        composeRule.onNodeWithTag(FeatureTestTags.BUTTON_GET_DATA_TYPE_1)
            .performClick()

        composeRule.onNodeWithText("Test Type 1")
            .assertIsDisplayed()
    }


    @Test
    fun clickButton2_isType2Displayed() {
        composeRule.onNodeWithTag(FeatureTestTags.BUTTON_GET_DATA_TYPE_2)
            .performClick()

        composeRule.onNodeWithText("Test Type 2")
            .assertIsDisplayed()
    }
}























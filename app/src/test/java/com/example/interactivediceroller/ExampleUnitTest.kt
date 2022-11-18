package com.example.interactivediceroller

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generates_number(){
        val diceClass = Dice(20)
        val diceResult = diceClass.roll()
        assertTrue("diceResult is not a D20 value", diceResult in 1 .. 20)
    }
}
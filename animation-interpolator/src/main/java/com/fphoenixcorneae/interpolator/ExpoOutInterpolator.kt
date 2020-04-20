package com.fphoenixcorneae.interpolator

import kotlin.math.pow

class ExpoOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return when (input) {
            1f -> {
                1f
            }
            else -> {
                ((-2.0).pow(-10 * input.toDouble()) + 1).toFloat()
            }
        }
    }
}
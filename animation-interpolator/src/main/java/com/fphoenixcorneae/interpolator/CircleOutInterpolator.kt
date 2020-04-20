package com.fphoenixcorneae.interpolator

import kotlin.math.sqrt

class CircleOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return sqrt(1 - (input - 1) * (input - 1).toDouble()).toFloat()
    }
}
package com.fphoenixcorneae.interpolator

import kotlin.math.sin

class SineOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return sin(input * Math.PI / 2).toFloat()
    }
}
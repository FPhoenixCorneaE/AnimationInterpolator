package com.fphoenixcorneae.interpolator

import kotlin.math.pow
import kotlin.math.sin

class BreathInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return if (input < 0.333) {
            (0.5f + 0.5f * sin(input * 3.0f * Math.PI - Math.PI * 0.5f)).toFloat()
        } else {
            (0.5 * sin(-3f * Math.PI * input * 0.5f + Math.PI) + 0.5f).pow(2.0).toFloat()
        }
    }
}
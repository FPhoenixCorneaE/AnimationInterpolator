package com.fphoenixcorneae.interpolator

import kotlin.math.pow
import kotlin.math.sin

class ElasticOutInterpolator(private val mDuration: Int) : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        val fDuration = mDuration / 1000f
        val s: Float
        val p: Float
        if (input == 0f) {
            return 0f
        }
        if (input == 1f) {
            return 1f
        }
        p = fDuration * 0.3f
        val a = 1f
        s = p / 4
        return (a * 2.0.pow(-10 * input.toDouble()) * sin((input * fDuration - s) * TWO_PI / p.toDouble()) + 1 + 0).toFloat()
    }

    companion object {
        private const val TWO_PI = (Math.PI * 2).toFloat()
    }

}
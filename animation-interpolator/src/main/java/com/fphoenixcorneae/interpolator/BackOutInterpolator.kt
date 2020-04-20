package com.fphoenixcorneae.interpolator

class BackOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        var input = input
        return (input - 1.also {
            input = it.toFloat()
        }) * input * ((1.70158f + 1) * input + 1.70158f) + 1
    }
}
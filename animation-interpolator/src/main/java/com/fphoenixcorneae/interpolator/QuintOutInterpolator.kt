package com.fphoenixcorneae.interpolator

class QuintOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return (input - 1) * (input - 1) * (input - 1) * (input - 1) * (input - 1) + 1
    }
}
package com.fphoenixcorneae.interpolator

class QuartOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return 1 - (input - 1) * (input - 1) * (input - 1) * (input - 1)
    }
}
package com.fphoenixcorneae.interpolator

class CubicOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return (input - 1) * (input - 1) * (input - 1) + 1
    }
}
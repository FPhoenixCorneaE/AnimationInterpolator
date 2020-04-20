package com.fphoenixcorneae.interpolator

class QuadOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        return -input * (input - 2)
    }
}
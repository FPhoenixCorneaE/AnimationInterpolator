package com.fphoenixcorneae.interpolator

class BounceOutInterpolator : BaseInterpolator() {
    override fun getInterpolation(input: Float): Float {
        var input = input
        return when {
            input < 1f / 2.75f -> {
                7.5625f * input * input
            }
            input < 2f / 2.75f -> {
                7.5625f * (1.5f / 2.75f).let { input -= it; input } * input + 0.75f
            }
            input < 2.5f / 2.75f -> {
                7.5625f * (2.25f / 2.75f).let { input -= it; input } * input + 0.9375f
            }
            else -> {
                7.5625f * (2.625f / 2.75f).let { input -= it; input } * input + 0.984375f
            }
        }
    }
}
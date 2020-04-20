package com.fphoenixcorneae.interpolator

import android.animation.TypeEvaluator
import android.view.animation.Interpolator

/**
 * Interpolator与TypeEvaluator封装
 */
open class BaseInterpolator : Interpolator,
    TypeEvaluator<Number> {
    override fun getInterpolation(input: Float): Float {
        return input
    }

    override fun evaluate(
        fraction: Float,
        startValue: Number,
        endValue: Number
    ): Number {
        return startValue.toFloat() + fraction * (endValue.toFloat() - startValue.toFloat())
    }

    override fun toString(): String {
        return javaClass.simpleName
    }
}
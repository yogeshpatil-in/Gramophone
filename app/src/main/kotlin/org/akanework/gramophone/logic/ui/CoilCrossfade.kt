package org.akanework.gramophone.logic.ui

import androidx.appcompat.content.res.AppCompatResources
import coil3.annotation.ExperimentalCoilApi
import coil3.asImage
import coil3.request.ImageRequest
import coil3.size.ScaleDrawable

@OptIn(ExperimentalCoilApi::class)
fun ImageRequest.Builder.placeholderScaleToFit(placeholder: Int) {
	placeholder { ScaleDrawable(AppCompatResources.getDrawable(it.context, placeholder)!!).asImage() }
}
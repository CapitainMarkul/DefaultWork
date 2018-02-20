package ru.tensor.myapplication.old.events

import android.content.Context
import android.databinding.BindingAdapter
import android.graphics.drawable.GradientDrawable
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.TextView
import ru.tensor.myapplication.R
import ru.tensor.myapplication.old.models.Event
import ru.tensor.myapplication.old.models.EventsType

const val STROKE_SIZE = 6

@BindingAdapter("changeShapeColor")
fun changeShapeColor(view: View, event: Event) {
    val context: Context = view.context
    val colorId = when (event.eventType) {
        EventsType.NO_FUN -> R.color.color_fun_event_type
        EventsType.MIDDLE_FUN -> R.color.color_middle_fun_event_type
        EventsType.FUN -> R.color.color_no_fun_event_type
    }

    val viewBackground = view.background
    when (viewBackground) {
        is GradientDrawable ->
            viewBackground.setStroke(STROKE_SIZE, ContextCompat.getColor(context, colorId))
    }

    view.background = viewBackground
}

@BindingAdapter("createEventTime")
fun changeShapeColor(view: TextView, event: Event) {
    //todo: Необходимо форматировать текст
    view.text = event.eventTime
}



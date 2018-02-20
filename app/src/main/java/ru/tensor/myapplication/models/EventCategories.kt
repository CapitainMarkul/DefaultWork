package ru.tensor.myapplication.models

import ru.tensor.myapplication.old.models.EventsType

data class EventCategories(
        val title: String,
        val eventType: EventsType,
        val checked: Boolean
)
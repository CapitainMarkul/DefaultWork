package ru.tensor.myapplication.new.createEvent

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import ru.tensor.myapplication.models.EventCategories

class Adapter constructor(context: Context, resourceId: Int, val eventsCategory: List<EventCategories>) :
        ArrayAdapter<EventCategories>(context, resourceId) {
//
//    val events: List<EventCategories> = ArrayList()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        View


        return super.getView(position, convertView, parent)
    }

}
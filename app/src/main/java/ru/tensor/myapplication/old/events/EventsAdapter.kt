package ru.tensor.myapplication.old.events

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.tensor.myapplication.R
import ru.tensor.myapplication.databinding.ItemEventCardBinding
import ru.tensor.myapplication.old.models.Event
import java.util.ArrayList

class EventsAdapter : RecyclerView.Adapter<EventsAdapter.ViewHolder>() {
    private val events: MutableList<Event> = ArrayList()

    public fun setItems(events: List<Event>) {
        this.events.clear()
        this.events.addAll(events)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val binding: ItemEventCardBinding = DataBindingUtil.bind(LayoutInflater.from(parent!!.context)
                .inflate(R.layout.item_event_card, parent, false))

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) = holder!!.bind(events[position])

    override fun getItemCount() = events.size

    class ViewHolder constructor(var binding: ItemEventCardBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(event: Event) = with(itemView) {
            binding.event = event
        }
    }
}
package ru.tensor.myapplication.person

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.tensor.myapplication.R
import ru.tensor.myapplication.databinding.FragmentPersonListBinding
import ru.tensor.myapplication.models.Person

class PersonFragment : Fragment() {

    lateinit var binding: FragmentPersonListBinding
    lateinit var personAdapter: Adapter

    companion object {
        fun newInstance(): PersonFragment {
            val args = Bundle()
//        args.putSerializable(ARG_CAUGHT, caught)

            val fragment = PersonFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        personAdapter = Adapter()
        personAdapter.setItems(generatePersons())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_person_list, container, false)
        binding = DataBindingUtil.bind(view)

        val linearLayoutManager = LinearLayoutManager(activity)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.listItems.layoutManager = linearLayoutManager
        binding.listItems.setHasFixedSize(true)
        binding.listItems.adapter = personAdapter

        return view
    }

    fun generatePersons(): ArrayList<Person> {
        val person: ArrayList<Person> = java.util.ArrayList()
        return (1..10).mapTo(person) { Person("Name #$it", "Second #$it", "Url #$it") }
    }
}
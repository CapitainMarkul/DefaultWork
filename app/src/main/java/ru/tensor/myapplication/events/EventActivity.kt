package ru.tensor.myapplication.events

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import ru.tensor.myapplication.R
import ru.tensor.myapplication.databinding.ActivityEventsBinding
import ru.tensor.myapplication.person.PersonFragment

class EventActivity : AppCompatActivity() {

    lateinit var binding: ActivityEventsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_events)
        setSupportActionBar(binding.toolbar)

//        goFragment(PersonFragment.newInstance())
        goFragment(EventsFragment.newInstance())
    }

    private fun goFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
    }
}
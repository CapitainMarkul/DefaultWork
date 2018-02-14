package ru.tensor.myapplication.person

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import ru.tensor.myapplication.R
import ru.tensor.myapplication.databinding.ActivityPersonsBinding

class PersonActivity : AppCompatActivity() {

    lateinit var binding: ActivityPersonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_persons)

        goFragment()
    }

    private fun goFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, PersonFragment.newInstance())
                .commit()
    }
}
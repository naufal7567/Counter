package org.d3ifcool.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import org.d3ifcool.counter.databinding.ActivityMainBinding

const val KEY_SCORE_A = "key_score_a"
const val KEY_SCORE_B = "key_score_b"

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: AngkaViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(AngkaViewModel::class.java)

        binding.angkaViewModel1 = viewModel
        binding.setLifecycleOwner(this)
    }
}

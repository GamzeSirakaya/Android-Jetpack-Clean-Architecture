package com.example.viewmodel2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewmodel2.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory=MainActivityViewModelFactory(125)
        viewModel=ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)
        binding.textView.text=viewModel.getTotal().toString()
        binding.button.setOnClickListener {
            viewModel.setTotal(binding.editTextTextPersonName.text.toString().toInt())
            binding.textView.text=viewModel.getTotal().toString()
        }

    }
}
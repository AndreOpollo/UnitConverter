package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.convertButton.setOnClickListener { convertUnit() }
    }

    private fun convertUnit() {
        val stringInTextField = binding.enterValueHere.text.toString()
        val unit = stringInTextField.toDoubleOrNull()
        if (unit == null) {
            binding.result.text = ""
            return
        }
        if(!binding.roundOff.isChecked) {
            //When kilogram is checked
            while (binding.kgOption.isChecked) {


                if (binding.kg2Option.isChecked) {
                    binding.result.text = ((unit * 1).toString())
                    break
                } else if (binding.grams2Option.isChecked) {
                    binding.result.text = ((unit * 1000).toString())
                    break
                } else if (binding.tonnes2Option.isChecked) {
                    binding.result.text = ((unit * 0.001).toString())
                    break
                } else {
                    binding.result.text = ((unit * 2.20462).toString())
                    break
                }
            }
            //When Pounds is checked
            while (binding.lbsOption.isChecked) {

                if (binding.kg2Option.isChecked) {
                    binding.result.text = ((unit / 2.20462).toString())
                    break
                } else if (binding.grams2Option.isChecked) {
                    binding.result.text = ((unit * 453.592).toString())
                    break
                } else if (binding.tonnes2Option.isChecked) {
                    binding.result.text = ((unit * 2205).toString())
                    break
                } else {
                    binding.result.text = ((unit * 1).toString())
                    break
                }
            }
            //When grams is checked
            while (binding.gramsOption.isChecked) {

                if (binding.kg2Option.isChecked) {
                    binding.result.text = ((unit * 0.001).toString())
                    break
                } else if (binding.grams2Option.isChecked) {
                    binding.result.text = ((unit * 1).toString())
                    break
                } else if (binding.tonnes2Option.isChecked) {
                    binding.result.text = ((unit * 0.000001).toString())
                    break
                } else {
                    binding.result.text = ((unit / 453.592).toString())
                    break
                }
            }
            //When tonne is checked
            while (binding.kgOption.isChecked) if (binding.kg2Option.isChecked) {
                binding.result.text = ((unit * 0.001).toString())
                break
            } else if (binding.grams2Option.isChecked) {
                binding.result.text = ((unit * 1000000).toString())
                break
            } else if (binding.tonnes2Option.isChecked) {
                binding.result.text = ((unit * 1).toString())
                break
            } else {
                binding.result.text = ((unit * 2204.62).toString())
                break
            }

        }else {//If round off is checked
            while (binding.kgOption.isChecked) if (binding.kg2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 1)).toString()
                break
            } else if (binding.grams2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 1000)).toString()
                break
            } else if (binding.tonnes2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 0.001)).toString()
                break
            } else {
                binding.result.text = (kotlin.math.round(unit * 2.20462)).toString()
                break
            }
            //When Pounds is checked
            while (binding.lbsOption.isChecked) if (binding.kg2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit / 2.20462)).toString()
                break
            } else if (binding.grams2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 453.592)).toString()
                break
            } else if (binding.tonnes2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 2205)).toString()
                break
            } else {
                binding.result.text = (kotlin.math.round(unit * 1)).toString()
                break
            }
            //When grams is checked
            while (binding.gramsOption.isChecked) if (binding.kg2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 0.001)).toString()
                break
            } else if (binding.grams2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 1)).toString()
                break
            } else if (binding.tonnes2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 0.000001)).toString()
                break
            } else {
                binding.result.text = (kotlin.math.round(unit / 453.592)).toString()
                break
            }
            //When tonne is checked
            while (binding.kgOption.isChecked) if (binding.kg2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 0.001)).toString()
                break
            } else if (binding.grams2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 1000000)).toString()
                break
            } else if (binding.tonnes2Option.isChecked) {
                binding.result.text = (kotlin.math.round(unit * 1)).toString()
                break
            } else {
                binding.result.text = (kotlin.math.round(unit * 2204.62)).toString()
                break
            }


        }
    }
}
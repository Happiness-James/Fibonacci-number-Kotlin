package com.happinessjames.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.happinessjames.recyclerviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberlist = DisplayNumberList(100)
        println(numberlist)

        binding.rvNumber.layoutManager = LinearLayoutManager(this)
        val numberAdapter = NewRecyclerViewAdapter(numberlist)
        binding.rvNumber.adapter = numberAdapter
    }
    fun DisplayNumberList(size:Int): List<Int>{
        var list = ArrayList<Int>()
      var firstNum = 0
        var secondNum = 1
        var counter = 0
        while (counter<=size){
            println(firstNum)
            val next = firstNum+secondNum
            firstNum=secondNum
            secondNum=next
            counter++
            list+=next
        }
        return list
    }
}
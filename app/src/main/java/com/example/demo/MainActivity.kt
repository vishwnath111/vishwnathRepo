package com.example.demo
import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class MyTestInfo{
            val name:String ="ram"
            val address:String ="indore"
            val dob:String ="12/12/2004"
        }
        val myTestInfo = MyTestInfo()
        with(myTestInfo){
            println(this.name)
            println(this.name)
        }

    }




}
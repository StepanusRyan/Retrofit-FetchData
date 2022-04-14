package com.stepanusryan.fetchdata_retrofit.home.data3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.stepanusryan.fetchdata_retrofit.databinding.ActivityData3Binding
import com.stepanusryan.fetchdata_retrofit.model.Data2
import com.stepanusryan.fetchdata_retrofit.model.Data3
import com.stepanusryan.fetchdata_retrofit.singleton.APIConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList

class Data3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityData3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txtName.visibility = View.INVISIBLE
        binding.txtAddress.visibility = View.INVISIBLE
        binding.txtAge.visibility = View.INVISIBLE
        binding.pgLoading.visibility = View.INVISIBLE

        binding.btnGet.setOnClickListener {
            binding.txtName.visibility = View.VISIBLE
            binding.txtAddress.visibility = View.VISIBLE
            binding.txtAge.visibility = View.VISIBLE
            binding.pgLoading.visibility = View.VISIBLE
            val client = APIConfig.getAPIService().getData3()
            client.enqueue(object : Callback<Data3>{
                override fun onResponse(call: Call<Data3>, response: Response<Data3>) {
                    binding.pgLoading.visibility = View.GONE

                    val data = response.body()?.employee as ArrayList<Data2>
                    for (i in 0 until data.count()){
                        binding.txtName.text = data[i].name
                        binding.txtAddress.text = data[i].address
                        binding.txtAge.text = data[i].age.toString()
                    }
                }
                override fun onFailure(call: Call<Data3>, t: Throwable) {
                    Toast.makeText(this@Data3Activity,"error : ${t.message}", Toast.LENGTH_LONG).show()
                }

            })
        }
    }
}
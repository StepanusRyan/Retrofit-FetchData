package com.stepanusryan.fetchdata_retrofit.home.data2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.stepanusryan.fetchdata_retrofit.databinding.ActivityData2Binding
import com.stepanusryan.fetchdata_retrofit.model.Data2
import com.stepanusryan.fetchdata_retrofit.singleton.APIConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Data2Activity : AppCompatActivity() {
    var dataList : List<Data2> ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityData2Binding.inflate(layoutInflater)
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

            val client = APIConfig.getAPIService().getData2()
            client.enqueue(object :Callback<List<Data2>>{
                override fun onResponse(call: Call<List<Data2>>, response: Response<List<Data2>>) {
                    binding.pgLoading.visibility = View.GONE
                    dataList = response.body()
                    for (data in dataList!!){
                        binding.txtName.text = data.name
                        binding.txtAddress.text = data.address
                        binding.txtAge.text = data.age.toString()
                    }
                }
                override fun onFailure(call: Call<List<Data2>>, t: Throwable) {
                    Toast.makeText(this@Data2Activity,"error : ${t.message}",Toast.LENGTH_LONG).show()
                }
            })
        }
    }
}
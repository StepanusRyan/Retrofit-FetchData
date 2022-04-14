package com.stepanusryan.fetchdata_retrofit.home.data1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.stepanusryan.fetchdata_retrofit.databinding.ActivityData1Binding
import com.stepanusryan.fetchdata_retrofit.model.Data1
import com.stepanusryan.fetchdata_retrofit.singleton.APIConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Data1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityData1Binding.inflate(layoutInflater)
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

            val client = APIConfig.getAPIService().getData()
            client.enqueue(object : Callback<Data1>{
                override fun onResponse(call: Call<Data1>, response: Response<Data1>) {
                    binding.pgLoading.visibility = View.GONE
                    binding.txtName.text = response.body()!!.name
                    binding.txtAddress.text = response.body()!!.address
                    binding.txtAge.text = response.body()!!.age.toString()
                }

                override fun onFailure(call: Call<Data1>, t: Throwable) {
                    Toast.makeText(this@Data1Activity,"error : $t",Toast.LENGTH_LONG).show()
                }

            })
        }

    }
}
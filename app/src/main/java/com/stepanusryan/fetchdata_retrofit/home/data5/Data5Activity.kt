package com.stepanusryan.fetchdata_retrofit.home.data5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.stepanusryan.fetchdata_retrofit.databinding.ActivityData5Binding
import com.stepanusryan.fetchdata_retrofit.model.weather.Weather
import com.stepanusryan.fetchdata_retrofit.model.weather.dataweather.DataWeather
import com.stepanusryan.fetchdata_retrofit.singleton.APIConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Data5Activity : AppCompatActivity() {
    private var binding:ActivityData5Binding ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityData5Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        hideView()
        binding?.btnGet?.setOnClickListener {
            showView()
            val client = APIConfig.getAPIService().getData5()
            client.enqueue(object : Callback<Weather>{
                override fun onResponse(call: Call<Weather>, response: Response<Weather>) {
                    binding?.pgLoading?.visibility = View.GONE
                    binding?.txtName?.visibility = View.VISIBLE

                    var name = response.body()?.name
                    var weather = response.body()?.weather as ArrayList<DataWeather>
                    var temp = response.body()?.main?.temp
                    var cuaca = weather[0].description
                    var main = weather[0].main
                    var visibility = response.body()?.visibility.toString()
                    var latitude = response.body()?.coord?.lat.toString()
                    var longitude = response.body()?.coord?.lon.toString()
                    Toast.makeText(this@Data5Activity,"kota :$name cuaca: $cuaca lat: $latitude", Toast.LENGTH_LONG).show()
                }

                override fun onFailure(call: Call<Weather>, t: Throwable) {
                    Toast.makeText(this@Data5Activity,"error : ${t.message}", Toast.LENGTH_LONG).show()
                }

            })
        }
    }
    private fun hideView(){
        binding?.txtName?.visibility = View.INVISIBLE
        binding?.txtMain?.visibility = View.INVISIBLE
        binding?.txtDesc?.visibility = View.INVISIBLE
        binding?.txtTemp?.visibility = View.INVISIBLE
        binding?.txtVisibility?.visibility = View.INVISIBLE
        binding?.txtLon?.visibility = View.INVISIBLE
        binding?.txtLat?.visibility = View.INVISIBLE
        binding?.pgLoading?.visibility = View.INVISIBLE
    }
    private fun showView() {
        binding?.txtMain?.visibility = View.VISIBLE
        binding?.txtDesc?.visibility = View.VISIBLE
        binding?.txtTemp?.visibility = View.VISIBLE
        binding?.txtVisibility?.visibility = View.VISIBLE
        binding?.txtLon?.visibility = View.VISIBLE
        binding?.txtLat?.visibility = View.VISIBLE
        binding?.pgLoading?.visibility = View.VISIBLE
    }
}
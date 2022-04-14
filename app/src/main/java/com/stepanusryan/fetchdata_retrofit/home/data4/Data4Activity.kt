package com.stepanusryan.fetchdata_retrofit.home.data4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.stepanusryan.fetchdata_retrofit.databinding.ActivityData4Binding
import com.stepanusryan.fetchdata_retrofit.model.bmkg.InfoGempa
import com.stepanusryan.fetchdata_retrofit.singleton.APIConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Data4Activity : AppCompatActivity() {
    private var binding:ActivityData4Binding ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityData4Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        hideView()
        binding?.btnGet?.setOnClickListener {
            showView()
            val client = APIConfig.getAPIService().getData4()
            client.enqueue(object : Callback<InfoGempa>{
                override fun onResponse(call: Call<InfoGempa>, response: Response<InfoGempa>) {
                    binding?.pgLoading?.visibility = View.GONE
                    binding?.txtJudul?.visibility = View.VISIBLE

                    binding?.txtTanggal?.text = response.body()?.info?.gempa?.tanggal
                    binding?.txtJam?.text = response.body()?.info?.gempa?.jam
                    binding?.txtDateTime?.text = response.body()?.info?.gempa?.datetime
                    binding?.txtCoordinate?.text = response.body()?.info?.gempa?.coordinates
                    binding?.txtLintang?.text = response.body()?.info?.gempa?.lintang
                    binding?.txtBujur?.text = response.body()?.info?.gempa?.bujur
                    binding?.txtMagnitude?.text = response.body()?.info?.gempa?.magnitude
                    binding?.txtKedalaman?.text = response.body()?.info?.gempa?.kedalaman
                    binding?.txtWilayah?.text = response.body()?.info?.gempa?.wilayah
                    binding?.txtPotensi?.text = response.body()?.info?.gempa?.potensi
                    binding?.txtDirasakan?.text = response.body()?.info?.gempa?.dirasakan

                    Glide.with(this@Data4Activity)
                            .load(response.body()?.info?.gempa?.shakemap)
                            .into(binding!!.imgShakemap)
                }
                override fun onFailure(call: Call<InfoGempa>, t: Throwable) {
                    Toast.makeText(this@Data4Activity,"error : ${t.message}", Toast.LENGTH_LONG).show()
                }

            })
        }
    }

    private fun hideView(){
        binding?.txtJudul?.visibility = View.INVISIBLE
        binding?.txtTanggal?.visibility = View.INVISIBLE
        binding?.txtJam?.visibility = View.INVISIBLE
        binding?.txtDateTime?.visibility = View.INVISIBLE
        binding?.txtCoordinate?.visibility = View.INVISIBLE
        binding?.txtLintang?.visibility = View.INVISIBLE
        binding?.txtBujur?.visibility = View.INVISIBLE
        binding?.txtMagnitude?.visibility = View.INVISIBLE
        binding?.txtKedalaman?.visibility = View.INVISIBLE
        binding?.txtWilayah?.visibility = View.INVISIBLE
        binding?.txtPotensi?.visibility = View.INVISIBLE
        binding?.txtDirasakan?.visibility = View.INVISIBLE
        binding?.imgShakemap?.visibility = View.INVISIBLE
        binding?.pgLoading?.visibility = View.INVISIBLE
    }
    private fun showView() {
        binding?.txtTanggal?.visibility = View.VISIBLE
        binding?.txtJam?.visibility = View.VISIBLE
        binding?.txtDateTime?.visibility = View.VISIBLE
        binding?.txtCoordinate?.visibility = View.VISIBLE
        binding?.txtLintang?.visibility = View.VISIBLE
        binding?.txtBujur?.visibility = View.VISIBLE
        binding?.txtMagnitude?.visibility = View.VISIBLE
        binding?.txtKedalaman?.visibility = View.VISIBLE
        binding?.txtWilayah?.visibility = View.VISIBLE
        binding?.txtPotensi?.visibility = View.VISIBLE
        binding?.txtDirasakan?.visibility = View.VISIBLE
        binding?.imgShakemap?.visibility = View.VISIBLE
        binding?.pgLoading?.visibility = View.VISIBLE
    }
}
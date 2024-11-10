package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PersegiActivity : AppCompatActivity() {

    private lateinit var etSisi: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegii) // Ensure this matches your layout file

        // Initialize UI components
        etSisi = findViewById(R.id.et_sisi)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate area of square
        btnHitungLuas.setOnClickListener {
            val sisi = etSisi.text.toString().toDoubleOrNull()

            if (sisi != null) {
                val luas = sisi * sisi
                tvHasil.text = "Hasil Luas: $luas"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk sisi."
            }
        }

        // Logic to calculate perimeter of square
        btnHitungKeliling.setOnClickListener {
            val sisi = etSisi.text.toString().toDoubleOrNull()

            if (sisi != null) {
                val keliling = 4 * sisi
                tvHasil.text = "Hasil Keliling: $keliling"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk sisi."
            }
        }
    }
}

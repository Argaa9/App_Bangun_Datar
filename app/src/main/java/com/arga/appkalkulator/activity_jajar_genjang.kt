package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class JajarGenjangActivity : AppCompatActivity() {

    private lateinit var etAlas: EditText
    private lateinit var etTinggi: EditText
    private lateinit var etSisi: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jajar_genjang) // Ensure this matches your layout file

        // Initialize UI components
        etAlas = findViewById(R.id.et_alas)
        etTinggi = findViewById(R.id.et_tinggi)
        etSisi = findViewById(R.id.et_sisi)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate area of parallelogram
        btnHitungLuas.setOnClickListener {
            val alas = etAlas.text.toString().toDoubleOrNull()
            val tinggi = etTinggi.text.toString().toDoubleOrNull()

            if (alas != null && tinggi != null) {
                val luas = alas * tinggi
                tvHasil.text = "Hasil Luas: $luas"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk alas dan tinggi."
            }
        }

        // Logic to calculate perimeter of parallelogram
        btnHitungKeliling.setOnClickListener {
            val sisi = etSisi.text.toString().toDoubleOrNull()

            if (sisi != null) {
                val keliling = 2 * (sisi + sisi) // Assuming both sides are equal
                tvHasil.text = "Hasil Keliling: $keliling"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk sisi."
            }
        }
    }
}

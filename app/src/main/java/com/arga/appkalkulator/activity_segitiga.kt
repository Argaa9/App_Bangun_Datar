package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegitigaActivity : AppCompatActivity() {

    private lateinit var etAlas: EditText
    private lateinit var etTinggi: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga) // Ensure this matches your layout file

        // Initialize UI components
        etAlas = findViewById(R.id.et_alas)
        etTinggi = findViewById(R.id.et_tinggi)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate the area of the triangle
        btnHitungLuas.setOnClickListener {
            val alas = etAlas.text.toString().toDoubleOrNull()
            val tinggi = etTinggi.text.toString().toDoubleOrNull()

            if (alas != null && tinggi != null) {
                val luas = 0.5 * alas * tinggi
                tvHasil.text = "Hasil Luas: $luas"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk alas dan tinggi."
            }
        }

        // Logic to calculate the perimeter of the triangle
        btnHitungKeliling.setOnClickListener {
            val alas = etAlas.text.toString().toDoubleOrNull()
            val tinggi = etTinggi.text.toString().toDoubleOrNull()

            if (alas != null && tinggi != null) {
                // Assuming the triangle is a right triangle
                val sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi)
                val keliling = alas + tinggi + sisiMiring
                tvHasil.text = "Hasil Keliling: $keliling"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk alas dan tinggi."
            }
        }
    }
}

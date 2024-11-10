package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BelahKetupatActivity : AppCompatActivity() {

    private lateinit var etDiagonal1: EditText
    private lateinit var etDiagonal2: EditText
    private lateinit var etSisi: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belah_ketupat) // Ensure this matches your layout file

        // Initialize UI components
        etDiagonal1 = findViewById(R.id.et_diagonal_1)
        etDiagonal2 = findViewById(R.id.et_diagonal_2)
        etSisi = findViewById(R.id.et_sisi)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate the area of the rhombus
        btnHitungLuas.setOnClickListener {
            val diagonal1 = etDiagonal1.text.toString().toDoubleOrNull()
            val diagonal2 = etDiagonal2.text.toString().toDoubleOrNull()

            if (diagonal1 != null && diagonal2 != null) {
                val luas = 0.5 * diagonal1 * diagonal2
                tvHasil.text = "Hasil Luas: $luas"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk diagonal."
            }
        }

        // Logic to calculate the perimeter of the rhombus
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

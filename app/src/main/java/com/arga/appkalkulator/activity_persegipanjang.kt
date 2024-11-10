package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PersegiPanjangActivity : AppCompatActivity() {

    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang) // Ensure this matches your layout file

        // Initialize UI components
        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate area of the rectangle
        btnHitungLuas.setOnClickListener {
            val panjang = etPanjang.text.toString().toDoubleOrNull()
            val lebar = etLebar.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null) {
                val luas = panjang * lebar
                tvHasil.text = "Hasil Luas: $luas"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk panjang dan lebar."
            }
        }

        // Logic to calculate perimeter of the rectangle
        btnHitungKeliling.setOnClickListener {
            val panjang = etPanjang.text.toString().toDoubleOrNull()
            val lebar = etLebar.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null) {
                val keliling = 2 * (panjang + lebar)
                tvHasil.text = "Hasil Keliling: $keliling"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk panjang dan lebar."
            }
        }
    }
}

package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LayangLayangActivity : AppCompatActivity() {

    private lateinit var etDiagonal1: EditText
    private lateinit var etDiagonal2: EditText
    private lateinit var etSisi1: EditText
    private lateinit var etSisi2: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layang_layang) // Ensure this matches your layout file

        // Initialize UI components
        etDiagonal1 = findViewById(R.id.et_diagonal_1)
        etDiagonal2 = findViewById(R.id.et_diagonal_2)
        etSisi1 = findViewById(R.id.et_sisi_1)
        etSisi2 = findViewById(R.id.et_sisi_2)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate area of rhombus
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

        // Logic to calculate perimeter of rhombus
        btnHitungKeliling.setOnClickListener {
            val sisi1 = etSisi1.text.toString().toDoubleOrNull()
            val sisi2 = etSisi2.text.toString().toDoubleOrNull()

            if (sisi1 != null && sisi2 != null) {
                val keliling = 2 * (sisi1 + sisi2)
                tvHasil.text = "Hasil Keliling: $keliling"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk sisi."
            }
        }
    }
}

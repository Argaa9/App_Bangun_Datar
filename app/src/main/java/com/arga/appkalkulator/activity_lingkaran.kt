package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LingkaranActivity : AppCompatActivity() {

    private lateinit var etJariJari: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran) // Ensure this matches your layout file

        // Initialize UI components
        etJariJari = findViewById(R.id.et_jari_jari)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate area of the circle
        btnHitungLuas.setOnClickListener {
            val jariJari = etJariJari.text.toString().toDoubleOrNull()

            if (jariJari != null) {
                val luas = Math.PI * jariJari * jariJari
                tvHasil.text = "Hasil Luas: $luas"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk jari-jari."
            }
        }

        // Logic to calculate circumference of the circle
        btnHitungKeliling.setOnClickListener {
            val jariJari = etJariJari.text.toString().toDoubleOrNull()

            if (jariJari != null) {
                val keliling = 2 * Math.PI * jariJari
                tvHasil.text = "Hasil Keliling: $keliling"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk jari-jari."
            }
        }
    }
}

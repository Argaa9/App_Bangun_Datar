package com.arga.appkalkulator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TrapesiumActivity : AppCompatActivity() {

    private lateinit var etAlasBesar: EditText
    private lateinit var etAlasKecil: EditText
    private lateinit var etTinggi: EditText
    private lateinit var etSisi1: EditText
    private lateinit var etSisi2: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapesium) // Ensure this matches your layout file

        // Initialize UI components
        etAlasBesar = findViewById(R.id.et_alas_besar)
        etAlasKecil = findViewById(R.id.et_alas_kecil)
        etTinggi = findViewById(R.id.et_tinggi)
        etSisi1 = findViewById(R.id.et_sisi_1)
        etSisi2 = findViewById(R.id.et_sisi_2)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tv_hasil)

        // Logic to calculate area of trapezium
        btnHitungLuas.setOnClickListener {
            val alasBesar = etAlasBesar.text.toString().toDoubleOrNull()
            val alasKecil = etAlasKecil.text.toString().toDoubleOrNull()
            val tinggi = etTinggi.text.toString().toDoubleOrNull()

            if (alasBesar != null && alasKecil != null && tinggi != null) {
                val luas = 0.5 * (alasBesar + alasKecil) * tinggi
                tvHasil.text = "Hasil Luas: $luas"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk semua input."
            }
        }

        // Logic to calculate perimeter of trapezium
        btnHitungKeliling.setOnClickListener {
            val alasBesar = etAlasBesar.text.toString().toDoubleOrNull()
            val alasKecil = etAlasKecil.text.toString().toDoubleOrNull()
            val sisi1 = etSisi1.text.toString().toDoubleOrNull()
            val sisi2 = etSisi2.text.toString().toDoubleOrNull()

            if (alasBesar != null && alasKecil != null && sisi1 != null && sisi2 != null) {
                val keliling = alasBesar + alasKecil + sisi1 + sisi2
                tvHasil.text = "Hasil Keliling: $keliling"
            } else {
                tvHasil.text = "Masukkan nilai yang valid untuk semua sisi."
            }
        }
    }
}

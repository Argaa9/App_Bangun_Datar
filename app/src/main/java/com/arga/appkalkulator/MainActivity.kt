package com.arga.appkalkulator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val buttonSegitiga = findViewById<Button>(R.id.buttonSegitiga)
        val buttonLingkaran = findViewById<Button>(R.id.buttonLingkaran)
        val buttonPersegi = findViewById<Button>(R.id.buttonPersegi)
        val buttonPersegiPanjang = findViewById<Button>(R.id.buttonPersegiPanjang)
        val buttonTrapesium = findViewById<Button>(R.id.buttonTrapesium)
        val buttonLayangLayang = findViewById<Button>(R.id.buttonLayangLayang)
        val buttonBelahKetupat = findViewById<Button>(R.id.buttonBelahKetupat)
        val buttonJajarGenjang = findViewById<Button>(R.id.buttonJajarGenjang)

        // Set onClickListeners for each button
        buttonSegitiga.setOnClickListener {
            startActivity(Intent(this, SegitigaActivity::class.java))
        }

        buttonLingkaran.setOnClickListener {
            startActivity(Intent(this, LingkaranActivity::class.java))
        }

        buttonPersegi.setOnClickListener {
            startActivity(Intent(this, PersegiActivity::class.java))
        }

        buttonPersegiPanjang.setOnClickListener {
            startActivity(Intent(this, PersegiPanjangActivity::class.java))
        }

        buttonTrapesium.setOnClickListener {
            startActivity(Intent(this, TrapesiumActivity::class.java))
        }

        buttonLayangLayang.setOnClickListener {
            startActivity(Intent(this, LayangLayangActivity::class.java))
        }

        buttonBelahKetupat.setOnClickListener {
            startActivity(Intent(this, BelahKetupatActivity::class.java))
        }

        buttonJajarGenjang.setOnClickListener {
            startActivity(Intent(this, JajarGenjangActivity::class.java))
        }
    }
}

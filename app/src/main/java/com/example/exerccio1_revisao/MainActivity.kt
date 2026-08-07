package com.example.Exerccio1_revisao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Exerccio1_revisao.MainActivity
import com.example.exerccio1_revisao.MainActivity2
import com.example.exerccio1_revisao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val login = binding.loginInput.text.toString().trim()
            val senha = binding.senhaInput.text.toString().trim()

            if(login == "Phietro" && senha == "2222"){

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("LOGIN_USUARIO", login)
                startActivity(intent)
                finish()

            } else {
                Toast.makeText(this, "Login e senha incorretos!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
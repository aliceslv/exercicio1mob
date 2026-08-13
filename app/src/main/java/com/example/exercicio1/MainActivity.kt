package com.example.exercicio1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicio1.databinding.ActivityMainBinding

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

            if (senha.length > 10) {

                if (login == "AlicePhietro" && senha == "12345678910") {
                    val intent = Intent(this, MainActivity2::class.java)
                    intent.putExtra("LOGIN_USUARIO", login)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Login e senha incorretos!", Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(this, "A senha deve ter mais de 10 caracteres!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
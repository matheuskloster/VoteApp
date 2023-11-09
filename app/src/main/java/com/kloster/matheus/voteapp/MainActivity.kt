package com.kloster.matheus.voteapp

import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kloster.matheus.voteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val votes = intArrayOf(0, 0, 0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnVote.setOnClickListener {
            when (binding.opcaoDeVoto.checkedRadioButtonId) {
                R.id.radioKarina -> {
                    incVote(0);
                }
                R.id.radioR10 -> {
                    incVote(1);
                }
                R.id.radioLula -> {
                    incVote(2);
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    private fun incVote(index: Int) {
        votes[index]++
        Toast.makeText(this, "Voto efetuado com sucesso", Toast.LENGTH_LONG).show();
    }
}
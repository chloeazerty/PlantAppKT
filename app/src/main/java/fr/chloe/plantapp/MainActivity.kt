package fr.chloe.plantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.chloe.plantapp.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injecter le fragment dans fragment_container
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null) //pas de retour sur ce composant
        transaction.commit() //envoyer le changement
    }
}
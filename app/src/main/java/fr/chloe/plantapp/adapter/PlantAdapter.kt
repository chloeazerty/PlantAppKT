package fr.chloe.plantapp.adapter

import android.view.View
import android.widget.ImageView

class PlantAdapter {
    //boite pour ranger tous les composants à controller
    class ViewHolder(view: View){
        //l'image de la plante
        val plantImage = view.findViewById<ImageView>()
    }
}
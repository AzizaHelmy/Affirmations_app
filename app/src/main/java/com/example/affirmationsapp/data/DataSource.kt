package com.example.affirmationsapp.data

import com.example.affirmationsapp.R
import com.example.affirmationsapp.model.Affirmation

class DataSource {

    fun loadAffirmations(): List<Affirmation>  {
        val affirmation1 = Affirmation(R.string.affirmation1,R.drawable.image1)//نسخ كتيره من المودل
        val affirmation2 = Affirmation(R.string.affirmation2,R.drawable.image2)
        val affirmation3 = Affirmation(R.string.affirmation3,R.drawable.image3)
        val affirmation4 = Affirmation(R.string.affirmation4,R.drawable.image4)
        val affirmation5 = Affirmation(R.string.affirmation5,R.drawable.image3)
        val affirmation6 = Affirmation(R.string.affirmation6,R.drawable.image2)
        val affirmation7 = Affirmation(R.string.affirmation7,R.drawable.image1)

        //and then i will fill the list with this data
        return listOf(affirmation1, affirmation2, affirmation3, affirmation4, affirmation5, affirmation6, affirmation7)

    }

}
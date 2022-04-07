package models.mainPage

import com.github.unqUi.model.RottenTomatoesSystem
import org.uqbar.commons.model.annotations.Observable

@Observable
open class RottenTomatoesHome(val rottenTomatoesSystem: RottenTomatoesSystem){

    fun getSystem(): RottenTomatoesSystem {
        return rottenTomatoesSystem
    }

    fun addCategory(thisWindow: RottenTomatoesHome) {
        val model = AddCategoryModel(rottenTomatoesSystem)
        val view = AddCategoryView(thisWindow, model)
    }

}
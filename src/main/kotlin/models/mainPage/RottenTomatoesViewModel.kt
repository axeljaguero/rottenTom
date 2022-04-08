package models.mainPage

import com.github.unqUi.model.Category
import com.github.unqUi.model.Movie
import com.github.unqUi.model.RottenTomatoesSystem
import com.github.unqUi.model.getRottenTomatoesSystem
import org.uqbar.commons.model.annotations.Observable

@Observable
class RottenTomatoesViewModel(rottenTomatoesSystem: RottenTomatoesSystem) {

    var movieList : List<Movie> = rottenTomatoesSystem.movies
    var categorylist : List<Category> = rottenTomatoesSystem.categories
//    var selectedCategory = categorylist.first()

}
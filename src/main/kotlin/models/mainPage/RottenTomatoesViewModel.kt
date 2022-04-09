package models.mainPage

import com.github.unqUi.model.Category
import com.github.unqUi.model.Movie
import com.github.unqUi.model.RottenTomatoesSystem
import com.github.unqUi.model.getRottenTomatoesSystem
import models.category.CategoryModel
import models.movie.MovieModel
import org.uqbar.commons.model.annotations.Observable

@Observable
class RottenTomatoesViewModel(rottenTomatoesSystem: RottenTomatoesSystem) {
    var categorylist = listOf(
        CategoryModel("1", "Acción"),
        CategoryModel("2", "Drama"),
        CategoryModel("3", "Terror")
    )

    var movieList = listOf(
        MovieModel("1", "asadd", "http://ajsjahsdbdf"),
        MovieModel("2", "sasad","http://ajsjahsdbdf"),
        MovieModel("3", "fdfasas","http://ajsjahsdbdf")
    )

    var selectedCategory = categorylist[0]
    var seletedMovie = movieList[0]

}
package models.movie

import org.uqbar.commons.model.annotations.Observable

@Observable
class MovieModel(var id: String, var title: String, var poster: String){
}
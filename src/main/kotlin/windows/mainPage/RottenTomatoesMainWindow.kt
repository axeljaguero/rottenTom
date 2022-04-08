package windows.mainPage



import models.category.CategoryModel
import models.mainPage.RottenTomatoesViewModel
import models.movie.MovieModel
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner

class RottenTomatoesMainWindow(owner: WindowOwner, model: RottenTomatoesViewModel) : SimpleWindow<RottenTomatoesViewModel>(owner, model) {


    override fun addActions(p0: Panel?) {
    }

    override fun createFormPanel(p0: Panel) {
        table<CategoryModel>(p0) {
            bindItemsTo("categorylist")
            visibleRows = 10
//            bindSelectionTo("selectedCategory")
            column {
                title = "ID"
                fixedSize = 500
                bindContentsTo("id")
            }
            column {
                title = "Name"
                fixedSize = 100
                bindContentsTo("name")
            }
        }
        table<MovieModel>(p0) {
            bindItemsTo("movieList")
            visibleRows = 10
            column {
                title = "ID"
                fixedSize = 500
                bindContentsTo("id")
            }
            column {
                title = "Name"
                fixedSize = 100
                bindContentsTo("title")
            }
            column {
                title = "Poster"
                fixedSize = 100
                bindContentsTo("poster")
            }
        }
    }
}
package windows.mainPage

import models.mainPage.RottenTomatoesViewModel
import models.movie.MovieModel
import models.category.CategoryModel
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner

class RottenTomatoesMainWindow(owner: WindowOwner, model: RottenTomatoesViewModel) : SimpleWindow<RottenTomatoesViewModel>(owner, model) {

    override fun addActions(actionsPanel: Panel?) {}
    override fun createFormPanel(p0: Panel?) {}

    override fun createMainTemplate(mainPanel: Panel) {
        title = "Cinepolis"
        mainPanel.asVertical();
        createListPanelCategory(mainPanel)
        createListPanelMovie(mainPanel)

    }
    private fun createListPanelMovie(mainPanel: Panel){
        Panel(mainPanel) with {
            asVertical()
            table<MovieModel>(mainPanel) {
                bindItemsTo("movieList")
                bindSelectionTo("seletedMovie")
                visibleRows = 10
                column {
                    title = "ID"
                    fixedSize = 100
                    bindContentsTo("id")
                }
                column {
                    title = "Title"
                    fixedSize = 200
                    bindContentsTo("title")
                }
                column {
                    title = "Poster"
                    fixedSize = 200
                    bindContentsTo("poster")
                }

            }

        }

        Panel(mainPanel) with {
            asHorizontal()
            Button(it) with {
                //TODO
                caption = "Add Category"
                //bindEnabledTo("NADA")
                onClick {

                }
            }
            Button(it) with {
                //TODO
                caption = "Edit Category"
                //bindEnabledTo("NADA")
                onClick {

                }
            }
        }
    }

    private fun createListPanelCategory(mainPanel: Panel){
        Panel(mainPanel) with {
            asVertical()
            table<CategoryModel>(mainPanel) {
                bindItemsTo("categorylist")
                visibleRows = 10
                bindSelectionTo("selectedCategory")
                column {
                    title = "ID"
                    fixedSize = 100
                    bindContentsTo("id")
                }
                column {
                    title = "Title"
                    fixedSize = 200
                    bindContentsTo("name")
                }
            }

        }
        Panel(mainPanel) with {
            asHorizontal()
            Button(it) with {
                //TODO
                caption = "Add Category"
                //bindEnabledTo("NADA")
                onClick {

                }
            }
            Button(it) with {
                //TODO
                caption = "Edit Category"
                //bindEnabledTo("NADA")
                onClick {

                }
            }
        }
    }
}


package windows.mainPage


import com.github.unqUi.model.RottenTomatoesSystem
import models.mainPage.RottenTomatoesViewModel
import org.uqbar.arena.Application
import org.uqbar.arena.windows.Window

class RottenTomatoesApp() : Application() {


    override fun createMainWindow() : Window<*> {
        return RottenTomatoesMainWindow(this, RottenTomatoesViewModel(RottenTomatoesSystem()))
    }

}

fun main() {
    RottenTomatoesApp().start()
}
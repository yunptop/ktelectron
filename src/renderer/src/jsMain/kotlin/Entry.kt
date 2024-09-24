import io.kvision.Application
import io.kvision.core.FlexDirection
import io.kvision.core.JustifyContent
import io.kvision.html.div
import io.kvision.panel.flexPanel
import io.kvision.panel.root
import io.kvision.startApplication
import io.kvision.utils.px

class App : Application() {

    override fun start() {
        root("root") {
            flexPanel(FlexDirection.ROW, justify = JustifyContent.CENTER) {
                div("Hello world!", className = "helloworld") {
                    marginTop = 50.px
                    fontSize = 50.px
                }
            }
        }
    }
}

fun main() {
    startApplication(::App)
}
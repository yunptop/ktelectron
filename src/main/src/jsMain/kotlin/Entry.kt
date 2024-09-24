import electron.BrowserWindow
import electron.app
import node.path
import kotlin.js.json

fun main() {
    app.whenReady().then {
        val window = BrowserWindow(
            json(
                "width" to 400,
                "height" to 300,
                "webPreferences" to json("preload" to path.join(app.getAppPath(), "output", "preload.js"))
            )
        )
        window.loadFile("output/renderer.html")

        window.on("closed") { ->
            app.exit()
        }
    }
}
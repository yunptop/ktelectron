import kotlin.js.json

external fun __non_webpack_require__(moduleName: String): dynamic

fun main() {
    val electron = __non_webpack_require__("electron")

    electron.contextBridge.exposeInMainWorld(
        "electron", json("hello" to { "world" })
    )
}
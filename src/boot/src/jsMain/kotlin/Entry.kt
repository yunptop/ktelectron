external fun __non_webpack_require__(moduleName: String): dynamic
external val global: dynamic

fun main() {
    global["electron"] = __non_webpack_require__("electron")
    global["path"] = __non_webpack_require__("path")
    __non_webpack_require__("./main")
}
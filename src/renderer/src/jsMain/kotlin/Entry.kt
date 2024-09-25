import kotlinx.browser.document

fun main() {
    document.querySelector("#root")?.innerHTML = "Hello World"
}
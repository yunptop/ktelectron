@file:JsQualifier("electron")

package electron

import kotlin.js.Json

/**
 * https://www.electronjs.org/docs/latest/api/browser-window
 */
external class BrowserWindow(options: Json) {
    fun loadFile(path: String)

    fun on(event: String, callback: () -> Unit)
    fun on(event: String, callback: (a0: dynamic) -> Unit)
    fun on(event: String, callback: (a0: dynamic, a1: dynamic) -> Unit)
    fun on(event: String, callback: (a0: dynamic, a1: dynamic, a2: dynamic) -> Unit)
    fun on(event: String, callback: (a0: dynamic, a1: dynamic, a2: dynamic, a3: dynamic) -> Unit)
    fun on(event: String, callback: (a0: dynamic, a1: dynamic, a2: dynamic, a3: dynamic, a4: dynamic) -> Unit)

    fun once(event: String, callback: () -> Unit)
    fun once(event: String, callback: (a0: dynamic) -> Unit)
    fun once(event: String, callback: (a0: dynamic, a1: dynamic) -> Unit)
    fun once(event: String, callback: (a0: dynamic, a1: dynamic, a2: dynamic) -> Unit)
    fun once(event: String, callback: (a0: dynamic, a1: dynamic, a2: dynamic, a3: dynamic) -> Unit)
    fun once(event: String, callback: (a0: dynamic, a1: dynamic, a2: dynamic, a3: dynamic, a4: dynamic) -> Unit)
}
@file:JsQualifier("electron")

package electron

import kotlin.js.Promise

external object app {
    fun whenReady(): Promise<Unit>
    fun quit()
    fun exit(code: Int = definedExternally)
    fun getAppPath(): String
}
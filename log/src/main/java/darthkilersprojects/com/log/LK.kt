package darthkilersprojects.com.log

fun <T> T.show(message: String? = null): T {
    if (message != null)
        L.show(message, this)
    else
        L.show(this)
    return this
}

fun <T> T.showDebug(message: String? = null): T {
    if (BuildConfig.DEBUG) {
        return show(message)
    } else
        return this
}
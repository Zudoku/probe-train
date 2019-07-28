package fi.zudoku.probe.di

import com.badlogic.gdx.Gdx

val Any.logTag: String
    get() = this.javaClass.simpleName

fun Any.logInfo(message: String) {
    Gdx.app.log(this.logTag, message)
}

fun Any.logDebug(message: String) {
    Gdx.app.debug(this.logTag, message)
}
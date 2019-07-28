package fi.zudoku.probe.screens.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import fi.zudoku.probe.di.logDebug
import fi.zudoku.probe.di.logInfo

class GameplayScreen: Screen {

    override fun hide() {
    }

    override fun show() {
        logInfo("Gameplay screen shown")
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
    }

    override fun pause() {
    }

    override fun resume() {
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun dispose() {
    }
}
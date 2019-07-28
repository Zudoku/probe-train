package fi.zudoku.probe.screens.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.utils.Timer
import fi.zudoku.probe.di.logDebug
import fi.zudoku.probe.di.logInfo
import fi.zudoku.probe.screens.logic.ScreenManager
import org.kodein.di.Kodein
import org.kodein.di.conf.global
import org.kodein.di.generic.instance

class MenuScreen: Screen {

    val screenManager: ScreenManager by Kodein.global.instance()

    override fun hide() {

    }

    override fun show() {
        logInfo("MenuScreen shown")
        Timer.schedule(object: Timer.Task() {
            override fun run() {
                screenManager.startGameplay("")
            }
        }, 5f)
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(1f, 0f, 1f, 1f)
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
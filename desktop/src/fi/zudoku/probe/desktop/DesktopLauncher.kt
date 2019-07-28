package fi.zudoku.probe.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import fi.zudoku.probe.ProbeGame

object DesktopLauncher {

    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.resizable = true
        LwjglApplication(ProbeGame(), config)
    }
}

package fi.zudoku.probe

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import fi.zudoku.probe.di.getGlobalGameModule
import fi.zudoku.probe.screens.screens.MenuScreen
import org.kodein.di.Kodein
import org.kodein.di.conf.global

class ProbeGame : Game() {

    override fun create() {
        Kodein.global.addImport(getGlobalGameModule(this))
        Kodein.global.getOrConstruct()

        setScreen(MenuScreen())
    }

}

package fi.zudoku.probe.di

import fi.zudoku.probe.ProbeGame
import fi.zudoku.probe.screens.logic.ScreenManager
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton


fun getGlobalGameModule(game: ProbeGame): Kodein.Module {
    return Kodein.Module("global game module", false, "a") {
        bind<ScreenManager>() with singleton { ScreenManager(game) }
    }
}
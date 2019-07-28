package fi.zudoku.probe.screens.logic

import fi.zudoku.probe.ProbeGame
import fi.zudoku.probe.screens.screens.GameplayScreen

class ScreenManager(private val game: ProbeGame) {

    fun startGameplay(filename: String) {
        val currentScreen = game.screen

        game.screen = GameplayScreen()
        currentScreen.dispose()
    }
}
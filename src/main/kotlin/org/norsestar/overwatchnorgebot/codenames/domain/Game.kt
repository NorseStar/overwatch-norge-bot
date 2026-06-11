package org.norsestar.overwatchnorgebot.codenames.domain

class Game(
    val id: String,
    val status: GameStatus,
    val board: Board,
    val redTeam: Team,
    val blueTeam: Team,
    val currentTurn: Int,
    val currentClue: String,
    val winner: Team?
) {
    fun joinTeam(team: Team) {

    }

    fun assignSpymaster(team: Team) {

    }

    fun start() {

    }

    fun giveClue() {

    }

    fun guessCard() {

    }

    fun endTurn() {

    }
}
package org.norsestar.overwatchnorgebot.codenames.domain

class Board(
    cards: Collection<String>
) {
    private val _words = cards.toMutableList()

    val words: List<String>
        get() = _words

    fun getCard(index: Int) {

    }

    fun revealCard(index: Int) {

    }

    fun remainingCardsForTeam(team: String) {

    }

    fun isAllTeamCardsRevealed(team: String): Boolean {
        TODO()
        return false
    }

}
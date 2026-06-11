package org.norsestar.overwatchnorgebot.codenames.domain

data class Card(
    val index: Int,
    val word: String,
    val identity: CardIdentity,
    val revealed: Boolean = false
) {

}
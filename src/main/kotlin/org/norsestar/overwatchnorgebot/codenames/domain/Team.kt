package org.norsestar.overwatchnorgebot.codenames.domain

class Team(
    val colour: TeamColour,
    val spymaster: Player?,
    val operatives: Set<Player>
) {

}
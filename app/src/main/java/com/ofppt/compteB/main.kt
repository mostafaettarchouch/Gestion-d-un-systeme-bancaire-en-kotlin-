package com.ofppt.compteB

fun main() {
    val bn = Banque()
    bn.creerUnClient("m","e")
    bn.creerUnClient("l","y")
    bn.creerUnClient("j","i")
    bn.creerUnClient("y","o")
    bn.afficherInfoClient()
    bn.ouvrieUnCompte(1)
    bn.ouvrieUnCompte(2)
    bn.afficherInfoBancaire()
}
package com.ofppt.compteB

data class Client(var nom:String,var prenom:String,) {
    var compteB = mutableListOf<CompteBancaire>()
    var id :Int = 0
    companion object {
        var cmp= 0
    }
    init {
        cmp ++
        id = cmp

    }

    override fun toString(): String {
        return "id : $id nom : $nom prenom : $prenom"
    }
}
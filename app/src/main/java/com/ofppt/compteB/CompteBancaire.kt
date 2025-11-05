package com.ofppt.compteB

class CompteBancaire {
    var TypeCompte:TypeDeComptes = TypeDeComptes.COURANT
    var sold:Double=0.0
    var numeroCompte:Int = 0
    companion object{
        var cmp = 0
    }
    init{
        cmp ++
        numeroCompte = cmp
    }
    fun depots(montan:Double){
        sold+=montan
    }
    fun retraits(montan: Double){
        if(sold>=montan){
            sold-=montan
        }
    }

    override fun toString(): String {
        return "numero de Compte Bancaire : $numeroCompte Sode : $sold"
    }


}
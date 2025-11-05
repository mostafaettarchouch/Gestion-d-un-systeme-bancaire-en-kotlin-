package com.ofppt.compteB

class Banque {
    var listeDeCliens= mutableListOf<Client>()
    var listeDeCompte= mutableListOf<CompteBancaire>()

    fun creerUnClient(nom:String,prenom:String){
        val cl = Client(nom,prenom)
        if(listeDeCliens.size >0){
            for(c in listeDeCliens){
                if(c.id == cl.id){
                    println("error")
                }else{
                    listeDeCliens.add(cl)
                    println("creeation un client $cl")
                }

            }
        }else{
            listeDeCliens.add(cl)
            println("creeation un client $cl")
        }


    }
    fun ouvrieUnCompte(id:Int){
        for(i in listeDeCliens){
            if(i.id == id){
                val compte = CompteBancaire()
                listeDeCompte.add(compte)
                i.compteB.add(compte)
            }
        }
    }

    fun afficherInfoClient(){
        listeDeCliens.forEach { println(it) }
    }
    fun afficherInfoBancaire(){
        listeDeCompte.forEach { println(it) }
    }


}
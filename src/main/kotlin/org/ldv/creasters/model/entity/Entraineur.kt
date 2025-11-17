package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Entraineur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var nom: String,
    var argent: Int,

    @OneToMany(mappedBy = "entraineur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var joueur: MutableList<Joueur> = mutableListOf(),

    @OneToMany(mappedBy = "entraineur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var individuMonstre: MutableList<IndividuMonstre> = mutableListOf(),

    @OneToMany(mappedBy = "entraineur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var item: MutableList<Item> = mutableListOf(),
){

}
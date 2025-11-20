package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Entraineur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long?,
    var nom: String,
    var argent: Int,
    //var equipeMonstre: IndividuMonstre? = null,

    @OneToMany(mappedBy = "entraineur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var joueur: MutableList<Joueur> = mutableListOf(),

    @OneToMany(mappedBy = "entraineur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var individuMonstre: MutableList<IndividuMonstre> = mutableListOf(),

    @OneToMany(mappedBy = "entraineur",cascade = [CascadeType.ALL], orphanRemoval = true)
    var item: MutableList<Item> = mutableListOf(),

    @OneToMany(mappedBy = "entraineur", orphanRemoval = true)
    var partie: MutableList<Partie> = mutableListOf()

){

}
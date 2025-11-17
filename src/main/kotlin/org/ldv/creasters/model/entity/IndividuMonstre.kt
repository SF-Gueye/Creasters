package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class IndividuMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var nom: String,
    //var especeMonstre: EspeceMonstre,
    var niveau: Int,
    var attaque: Int,
    var defense: Int,
    var vitesse: Int,
    var attaqueSpe: Int,
    var defenseSpe: Int,
    var Pvmax: Int,
    var potentiel: Double,
    var exp: Double,
    var pv: Int,
    //var Entraineur: Entraineur?
    ){

}
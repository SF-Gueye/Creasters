package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Partie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
//    var joueur: Joueur,
//    var zone: Zone,
    ){

}
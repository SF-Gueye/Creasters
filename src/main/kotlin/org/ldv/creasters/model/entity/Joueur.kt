package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Joueur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var identifiant: String,
    var mdp: String,
    ){

}
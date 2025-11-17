package org.ldv.creasters.model.entity
import jakarta.persistence.*
//TODO changer le type de valeur pour les variables de combat monstre
@Entity
class combatMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var monstreJoueur: Long?,
    var monstreEnnemi: Long?
    ){

}
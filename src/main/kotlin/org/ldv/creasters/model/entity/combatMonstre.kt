package org.ldv.creasters.model.entity
import jakarta.persistence.*
//TODO changer le type de valeur pour les variables de combat monstre
@Entity
class CombatMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var monstreJoueur: Long?,
    var monstreEnnemi: Long?,

    @OneToMany(mappedBy = "combatMonstre",cascade = [CascadeType.ALL], orphanRemoval = true)
    var individuMonstre: MutableList<IndividuMonstre> = mutableListOf()
){

}
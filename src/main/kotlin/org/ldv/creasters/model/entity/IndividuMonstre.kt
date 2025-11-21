package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class IndividuMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long?,
    var nom: String,
    var espece: EspeceMonstre?,
    var niveau: Int,
    var attaque: Int,
    var defense: Int,
    @Column(unique = true)
    var vitesse: Int,
    var attaqueSpe: Int,
    var defenseSpe: Int,
    var Pvmax: Int,
    var potentiel: Double,
    var exp: Double,
    var pv: Int,
    var Entraineur: Entraineur? = null,

    @ManyToOne
    @JoinColumn(name = "especeMonstre_id")
    var especeMonstre: EspeceMonstre? = null,

    @ManyToOne
    @JoinColumn(name = "entraineur_id")
    var entraineur: Entraineur? = null,

    @ManyToMany
    @JoinTable(
        name = "individu_monstre_zone",
        joinColumns = [JoinColumn(name = "individuMonstre_id")],
        inverseJoinColumns = [JoinColumn(name = "zone_id")]
    )
    var zone: MutableList<Zone> = mutableListOf(),

    @ManyToOne
    @JoinColumn(name = "combatMonstre_id")
    var combatMonstre: CombatMonstre? = null

){

}
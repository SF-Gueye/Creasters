package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_role", discriminatorType = DiscriminatorType.STRING)
class Joueur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,
    var identifiant: String,
    var mdp: String,
    var email: String,
    //var boiteMonstre: IndividuMonstre?,
    //var sacàItem: Item?,

    @ManyToOne
    @JoinColumn(name = "entraineur_id")
    var entraineur : Entraineur? = null,

    @OneToMany(mappedBy = "joueur", orphanRemoval = true)
    var partie: MutableList<Partie> = mutableListOf()

){

}
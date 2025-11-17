package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Joueur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long?,
    var identifiant: String,
    var mdp: String,
    @ManyToOne
    @JoinColumn(name = "entraineur_id")
    var entraineur : Entraineur? = null
){

}
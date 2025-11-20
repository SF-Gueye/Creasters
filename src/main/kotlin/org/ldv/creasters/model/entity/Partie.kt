package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Partie(
 //   @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)

    @EmbeddedId
    var partieId: PartieId? = null,


    @MapsId("joueurId")
    @ManyToOne
    @JoinColumn(name = "joueur_id")
    var joueur: Joueur? = null,


    @MapsId("entraineurId")
    @ManyToOne
    @JoinColumn(name = "entraineur_id")
    var entraineur: Entraineur? = null

//    var id: Long?,
//    var joueur: Joueur,
//    var zone: Zone,
    ){

}
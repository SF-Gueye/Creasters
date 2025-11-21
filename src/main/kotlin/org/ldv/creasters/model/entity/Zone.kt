package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Zone (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long?,
    var nom: String,
    var expZone: Double,
    var zoneSuivante: Zone?,
    var zonePrecedente: Zone?,

    @ManyToOne
    @JoinColumn(name = "image_id")
    var image: Image? = null,

    @ManyToMany(mappedBy = "zone")
    var individuMonstre: MutableList<IndividuMonstre> = mutableListOf()
    ){

}

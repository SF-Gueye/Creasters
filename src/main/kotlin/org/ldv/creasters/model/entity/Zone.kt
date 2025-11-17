package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Zone (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var nom: String,
    var expZone: Double,
//    var zoneSuivante: Zone?,
//    var zonePrecedente: Zone?,
    ){

}

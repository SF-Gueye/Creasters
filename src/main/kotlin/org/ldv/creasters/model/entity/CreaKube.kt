package org.ldv.creasters.model.entity
import jakarta.persistence.*
@Entity
@DiscriminatorValue("CONSOMMABLE")
class CreaKube(
    var chancedeCapture: Double,
    nom: String,
    description: String,
    ): Item(nom = nom, description = description){

}
package org.ldv.creasters.model.entity
import jakarta.persistence.*
@Entity
@DiscriminatorValue("OBJET CLEE")
class Badge(
    //var champion:Entraineur,
    nom: String,
    description: String,
): Item(nom = nom, description = description) {

}
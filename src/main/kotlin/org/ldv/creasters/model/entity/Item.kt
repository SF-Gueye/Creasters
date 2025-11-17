package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var nom: String,
    var description: String
){

}

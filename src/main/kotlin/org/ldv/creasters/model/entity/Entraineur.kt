package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Entraineur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var nom: String,
    var argent: Int,
    ){

}
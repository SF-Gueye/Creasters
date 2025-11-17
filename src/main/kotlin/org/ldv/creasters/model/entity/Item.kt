package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long?,
    var nom: String,
    var description: String,

    @ManyToOne
    @JoinColumn(name = "image_id")
    var image: Image? = null,

    @ManyToOne
    @JoinColumn(name = "entraineur_id")
    var entraineur: Entraineur? = null
){

}

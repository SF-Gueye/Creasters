package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_item", discriminatorType = DiscriminatorType.STRING)
class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long?= null,
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

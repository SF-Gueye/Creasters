package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class Image(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var lien: String,

    @OneToMany(mappedBy = "image",cascade = [CascadeType.ALL], orphanRemoval = true)
    var zone: MutableList<Zone> = mutableListOf(),

    @OneToMany(mappedBy = "image",cascade = [CascadeType.ALL], orphanRemoval = true)
    var item: MutableList<Item> = mutableListOf()
) {
}
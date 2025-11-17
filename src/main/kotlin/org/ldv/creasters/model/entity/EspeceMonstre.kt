package org.ldv.creasters.model.entity
import jakarta.persistence.*

@Entity
class EspeceMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var nom: String,
    var type: String,
    var baseAttaque: Int,
    var baseDefense: Int,
    var baseVitesse: Int,
    var baseAttaqueSp: Int,
    var baseDefenseSp: Int,
    var basePv: Int,
    var modAttaque: Double,
    var modDefense: Double,
    var modVitesse: Double,
    var modAttaqueSp: Double,
    var modDefenseSp: Double,
    var modPv: Double,
    var description: String?,
    var particularitese: String?,
    var caracteres: String?
    ){

}
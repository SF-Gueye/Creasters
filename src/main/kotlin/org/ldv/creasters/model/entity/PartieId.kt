package org.ldv.creasters.model.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class PartieId (
    var joueurId: Long,
    var entraineurId: Long
): Serializable {
}

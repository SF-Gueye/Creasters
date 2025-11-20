package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.CombatMonstre
import org.springframework.data.jpa.repository.JpaRepository

interface DAOCombatMonstre: JpaRepository<CombatMonstre, Long> {
}
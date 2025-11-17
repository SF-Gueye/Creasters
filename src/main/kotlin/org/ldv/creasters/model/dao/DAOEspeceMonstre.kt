package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.EspeceMonstre
import org.springframework.data.jpa.repository.JpaRepository

interface DAOEspeceMonstre : JpaRepository<EspeceMonstre, Long> {
}

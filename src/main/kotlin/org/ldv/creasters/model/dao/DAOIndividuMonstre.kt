package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.IndividuMonstre
import org.springframework.data.jpa.repository.JpaRepository

interface DAOIndividuMonstre : JpaRepository<IndividuMonstre, Long> {
}
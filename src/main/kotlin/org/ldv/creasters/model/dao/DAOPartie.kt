package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Partie
import org.springframework.data.jpa.repository.JpaRepository

interface DAOPartie : JpaRepository<Partie, Long> {
}
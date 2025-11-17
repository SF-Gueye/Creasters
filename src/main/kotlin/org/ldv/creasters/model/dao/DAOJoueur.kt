package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Joueur
import org.springframework.data.jpa.repository.JpaRepository

interface DAOJoueur: JpaRepository<Joueur, Long> {
}
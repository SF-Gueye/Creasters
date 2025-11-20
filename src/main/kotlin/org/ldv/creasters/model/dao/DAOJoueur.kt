package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Joueur
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface DAOJoueur: JpaRepository<Joueur, Long> {
    @Query("select j from Joueur j where j.email = ?1")
    fun findByEmail(email: String): Joueur
}
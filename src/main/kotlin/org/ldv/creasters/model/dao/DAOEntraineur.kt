package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Entraineur
import org.springframework.data.jpa.repository.JpaRepository

interface DAOEntraineur : JpaRepository<Entraineur, Long> {
}

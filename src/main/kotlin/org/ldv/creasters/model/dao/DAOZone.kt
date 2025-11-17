package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Zone
import org.springframework.data.jpa.repository.JpaRepository

interface DAOZone : JpaRepository<Zone, Long> {
}
package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Badge
import org.springframework.data.jpa.repository.JpaRepository

interface DAOBadge: JpaRepository<Badge, Long> {
}
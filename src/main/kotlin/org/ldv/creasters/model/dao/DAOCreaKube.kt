package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.CreaKube
import org.springframework.data.jpa.repository.JpaRepository

interface DAOCreaKube: JpaRepository<CreaKube, Long> {
}
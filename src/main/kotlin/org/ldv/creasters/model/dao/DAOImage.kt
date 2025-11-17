package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Image
import org.springframework.data.jpa.repository.JpaRepository

interface DAOImage : JpaRepository<Image, Long> {
}
package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Admin
import org.springframework.data.jpa.repository.JpaRepository

interface DAOAdmin : JpaRepository<Admin, Long> {
}
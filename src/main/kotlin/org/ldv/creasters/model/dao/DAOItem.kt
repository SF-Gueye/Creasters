package org.ldv.creasters.model.dao
import org.ldv.creasters.model.entity.Item
import org.springframework.data.jpa.repository.JpaRepository

interface DAOItem : JpaRepository<Item, Long>{
}
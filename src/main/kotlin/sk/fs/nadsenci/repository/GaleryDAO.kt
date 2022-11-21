package sk.fs.nadsenci.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import sk.fs.nadsenci.model.galery.Photo

@Repository
interface GaleryDAO : CrudRepository<Photo, Long> {

    @Query(value = "SELECT p FROM Photo p WHERE p.createdDate<= ?1")
    fun findAllByYear(year: String): MutableIterable<Photo>
}
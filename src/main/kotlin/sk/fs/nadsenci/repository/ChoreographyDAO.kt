package sk.fs.nadsenci.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import sk.fs.nadsenci.model.info.Choreography

@Repository
interface ChoreographyDAO : CrudRepository<Choreography, Long> {

    fun findChoreographyByTitle(title: String): Choreography?

}
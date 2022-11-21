package sk.fs.nadsenci.service.info

import sk.fs.nadsenci.model.info.Choreography

interface ChoreographyService {
    fun getAllChoreographies(): List<Choreography>?
    fun getChoreographyByName(name: String): Choreography?

}

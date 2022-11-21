package sk.fs.nadsenci.resource.info

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.fs.nadsenci.model.info.Choreography
import sk.fs.nadsenci.service.info.ChoreographyService

@RestController
@RequestMapping("choreography")
class ChoreographyResource(private val choreography: ChoreographyService) {

    @GetMapping("/")
    fun getAllChoreographies(): ResponseEntity<List<Choreography>> =
        ResponseEntity.ok(choreography.getAllChoreographies())

    @GetMapping("/{name}")
    fun getChoreographyByName(@PathVariable name: String): ResponseEntity<Choreography> =
        ResponseEntity.ok(choreography.getChoreographyByName(name))
}
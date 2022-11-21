package sk.fs.nadsenci.resource.info

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.fs.nadsenci.model.galery.Photo
import sk.fs.nadsenci.service.info.GaleryService

@RestController
@RequestMapping("galery")
class GaleryResource(private val galeryService: GaleryService) {

    @GetMapping("/")
    fun getAll(): ResponseEntity<List<Photo>> = ResponseEntity.ok(galeryService.getAll())

    @GetMapping("/{year}")
    fun geAllByYear(@PathVariable year: String): ResponseEntity<List<Photo>> =
        ResponseEntity.ok(galeryService.getByYear(year))

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Photo> = ResponseEntity.ok(galeryService.getById(id))
}
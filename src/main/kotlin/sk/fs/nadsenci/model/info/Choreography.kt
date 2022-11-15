package sk.fs.nadsenci.model.info

import sk.fs.nadsenci.model.galery.Photo
import java.util.Date

data class Choreography(
    val title: String,
    val choreographer: String?,
    val prices: List<String>?,
    val photo: Photo,
    val yearOfCreation: Date?

)

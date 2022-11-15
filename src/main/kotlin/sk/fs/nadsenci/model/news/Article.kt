package sk.fs.nadsenci.model.news

import sk.fs.nadsenci.model.Language
import sk.fs.nadsenci.model.galery.Photo
import java.util.Date

data class Article(
    val title: String,
    val date: Date,
    val description: String,
    val photo: Photo?,
    val language: Language
)

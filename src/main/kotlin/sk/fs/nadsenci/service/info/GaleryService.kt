package sk.fs.nadsenci.service.info

import sk.fs.nadsenci.model.galery.Photo

interface GaleryService {
    fun getAll(): List<Photo>?
    fun getByYear(year: String): List<Photo>?
    fun getById(id: Long): Photo?

}

package sk.fs.nadsenci.service.info

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import sk.fs.nadsenci.model.galery.Photo
import sk.fs.nadsenci.repository.GaleryDAO
import javax.transaction.Transactional

@Service
@Transactional
class GaleryServiceImpl(private val galeryDAO: GaleryDAO) : GaleryService {
    override fun getAll(): List<Photo>? = galeryDAO.findAll().toList()

    override fun getByYear(year: String): List<Photo>? = galeryDAO.findAllByYear(year).toList()

    override fun getById(id: Long): Photo? = galeryDAO.findByIdOrNull(id)
}
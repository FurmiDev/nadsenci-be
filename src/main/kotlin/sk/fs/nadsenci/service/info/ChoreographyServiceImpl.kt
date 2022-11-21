package sk.fs.nadsenci.service.info

import org.springframework.stereotype.Service
import sk.fs.nadsenci.model.info.Choreography
import sk.fs.nadsenci.repository.ChoreographyDAO
import javax.transaction.Transactional

@Transactional
@Service
class ChoreographyServiceImpl(private val choreographyDAO: ChoreographyDAO) : ChoreographyService {
    override fun getAllChoreographies(): List<Choreography> = choreographyDAO.findAll().toList()

    override fun getChoreographyByName(name: String): Choreography? = choreographyDAO.findChoreographyByTitle(name)
}
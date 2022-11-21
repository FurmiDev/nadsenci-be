package sk.fs.nadsenci.service.info

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import sk.fs.nadsenci.model.news.Article
import sk.fs.nadsenci.repository.ArticleDAO
import javax.transaction.Transactional

@Service
@Transactional
class ArticleServiceImpl(private val articleDAO: ArticleDAO) : ArticleService {
    override fun getAll(): List<Article> = articleDAO.findAll().toList()

    override fun getById(id: Long): Article? = articleDAO.findByIdOrNull(id)
}
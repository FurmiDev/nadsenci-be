package sk.fs.nadsenci.repository

import org.springframework.data.repository.CrudRepository
import sk.fs.nadsenci.model.news.Article
import javax.annotation.Resource

@Resource
interface ArticleDAO : CrudRepository<Article, Long>

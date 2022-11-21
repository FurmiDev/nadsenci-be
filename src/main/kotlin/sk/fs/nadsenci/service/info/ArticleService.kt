package sk.fs.nadsenci.service.info

import sk.fs.nadsenci.model.news.Article

interface ArticleService {
    fun getAll(): List<Article>
    fun getById(id: Long): Article?

}

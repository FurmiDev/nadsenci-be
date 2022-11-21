package sk.fs.nadsenci.resource.info

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.fs.nadsenci.model.news.Article
import sk.fs.nadsenci.service.info.ArticleService

@RestController
@RequestMapping("article")
class ArticleResource(private val articleService: ArticleService) {

    @GetMapping("/")
    fun getAll(): ResponseEntity<List<Article>> = ResponseEntity.ok(articleService.getAll())

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Article> = ResponseEntity.ok(articleService.getById(id))

}
package sk.fs.nadsenci.model.news

import org.hibernate.Hibernate
import sk.fs.nadsenci.model.Language
import sk.fs.nadsenci.model.galery.Photo
import java.time.Instant
import java.util.*
import javax.persistence.*

@Entity
data class Article(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
    val title: String,
    val date: Date,
    val description: String,
    @OneToMany(mappedBy = "id")
    val photo: List<Photo>?,
    val language: Language
) {
    constructor() : this(null, "", Date.from(Instant.now()), "", emptyList(), Language.SLOVAK)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Article

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , title = $title , date = $date , description = $description , language = $language )"
    }

}

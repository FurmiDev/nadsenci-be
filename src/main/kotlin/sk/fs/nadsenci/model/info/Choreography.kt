package sk.fs.nadsenci.model.info

import org.hibernate.Hibernate
import sk.fs.nadsenci.model.galery.Photo
import java.util.*
import javax.persistence.*

@Entity
data class Choreography(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
    val title: String,
    val choreographer: String?,
    @ElementCollection
    val prices: List<String>?,
    @OneToMany(mappedBy = "id")
    val photo: List<Photo>,
    val yearOfCreation: Date?

) {
    constructor() : this(null, "", "", emptyList(), emptyList(), null)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Choreography

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , title = $title , choreographer = $choreographer , prices = $prices , yearOfCreation = $yearOfCreation )"
    }

}

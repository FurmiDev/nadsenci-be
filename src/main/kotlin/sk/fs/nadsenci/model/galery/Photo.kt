package sk.fs.nadsenci.model.galery

import org.hibernate.Hibernate
import javax.persistence.*

@Entity
data class Photo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long? = null,
    val location: String,
    val description: String?,
    val title: String?
) {
    constructor() : this(null,"","","")

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Photo

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , location = $location , description = $description , title = $title )"
    }
}

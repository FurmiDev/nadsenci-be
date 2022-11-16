package sk.fs.nadsenci.model.info

import org.hibernate.Hibernate
import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.Role
import javax.persistence.*

@Entity
data class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: Long? = null,
    val gender: Gender,
    val title: String?,
    val firstName: String,
    val lastName: String,
    val nickName: String?,
    val email: String?,
    val phoneNumber: String?,
    @ElementCollection
    val ensembles: List<String>?,
    val role: Role
) {
    constructor() : this(null, Gender.NOT_DEFINED, "", "", "", "", "", "", null, Role.VISITOR)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Member

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , gender = $gender , title = $title , firstName = $firstName , lastName = $lastName , nickName = $nickName , email = $email , phoneNumber = $phoneNumber , ensembles = $ensembles , role = $role )"
    }

}
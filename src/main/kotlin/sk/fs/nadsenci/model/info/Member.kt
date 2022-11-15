package sk.fs.nadsenci.model.info

import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.galery.Photo

data class Member(
    val gender: Gender,
    val title: String?,
    val firstName: String,
    val lastName: String,
    val nickName: String?,
    val photo: Photo?,
    val email: String?,
    val phoneNumber: String?,
    val ensembles: List<String>?,
    val role: sk.fs.nadsenci.model.Role
)
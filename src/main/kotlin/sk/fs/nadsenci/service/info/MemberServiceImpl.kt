package sk.fs.nadsenci.service.info

import org.springframework.stereotype.Service
import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.Role
import sk.fs.nadsenci.model.info.Member

@Service
class MemberServiceImpl : MemberService {
    override fun getAll(): List<Member>? {
        TODO("Not yet implemented")
    }

    override fun getMemberById(memberId: String): Member? = Member(
        Gender.MALE,
        "Ing",
        "Matej",
        "Furmanek",
        "Furmi",
        null,
        "matej.furmanek@gmail.com",
        "",
        listOf("Vrsatec"),
        Role.ADMIN
    )

    override fun getMembersByGender(gender: String): List<Member>?  = listOf(
        Member(
            Gender.MALE,
            "Ing",
            "Matej",
            "Furmanek",
            "Furmi",
            null,
            "matej.furmanek@gmail.com",
            "",
            listOf("Vrsatec"),
            Role.ADMIN
        ),
        Member(
            Gender.MALE,
            "Ing",
            "Martin",
            "Matuscin",
            "Scino",
            null,
            "martin.matuscin@gmail.com",
            "",
            listOf("Machnáčiku", "Trenčane", "Karpatoch"),
            Role.ADMIN
        )
    )


}

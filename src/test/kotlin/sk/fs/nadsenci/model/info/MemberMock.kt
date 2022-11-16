package sk.fs.nadsenci.model.info

import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.Role

class MemberMock {
    companion object {
        fun createMember(): Member = Member(
            null,
            Gender.MALE,
            "Ing",
            "Matej",
            "Furmanek",
            "Furmi",
            "matej.furmanek@gmail.com",
            "+421910123456",
            listOf("Vrsatec"),
            Role.MEMBER
        )
    }
}
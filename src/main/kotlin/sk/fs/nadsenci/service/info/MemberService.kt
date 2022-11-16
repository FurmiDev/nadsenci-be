package sk.fs.nadsenci.service.info

import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.info.Member
import java.util.*

interface MemberService {
    fun getAll(): MutableIterable<Member>
    fun getMemberById(memberId: Long): Member?
    fun getMembersByGender(gender: Gender): List<Member>?

    fun getMemberByNickname(nickname: String): Member?
}

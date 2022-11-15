package sk.fs.nadsenci.service.info

import sk.fs.nadsenci.model.info.Member

interface MemberService {
    fun getAll(): List<Member>?
    fun getMemberById(memberId: String): Member?
    fun getMembersByGender(gender: String): List<Member>?

}

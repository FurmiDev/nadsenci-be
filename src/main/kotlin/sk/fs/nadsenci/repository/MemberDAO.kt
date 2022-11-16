package sk.fs.nadsenci.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.info.Member

@Repository
interface MemberDAO : CrudRepository<Member, Long> {
    fun findMembersByGender(gender: Gender): List<Member>

    fun findByNickName(nickName: String): Member?
}
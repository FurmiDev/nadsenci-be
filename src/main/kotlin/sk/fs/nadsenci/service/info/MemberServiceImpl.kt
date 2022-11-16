package sk.fs.nadsenci.service.info

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import sk.fs.nadsenci.repository.MemberDAO
import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.Role
import sk.fs.nadsenci.model.info.Member
import java.util.*
import javax.transaction.Transactional

@Service
@Transactional
class MemberServiceImpl(var memberDAO: MemberDAO) : MemberService {
    override fun getAll(): MutableIterable<Member> = memberDAO.findAll()

    override fun getMemberById(memberId: Long): Member? = memberDAO.findByIdOrNull(memberId)

    override fun getMemberByNickname(nickname: String): Member? = memberDAO.findByNickName(nickname)

    override fun getMembersByGender(gender: Gender): List<Member>? = memberDAO.findMembersByGender(gender)


}

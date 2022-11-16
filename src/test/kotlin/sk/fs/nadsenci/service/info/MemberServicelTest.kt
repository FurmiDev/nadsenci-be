package sk.fs.nadsenci.service.info

import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.ActiveProfiles
import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.info.MemberMock
import sk.fs.nadsenci.repository.MemberDAO

@DataJpaTest
@ActiveProfiles("test")
class MemberServicelTest {

    private final val memberDAO: MemberDAO = mockk()

    private final val user = MemberMock.createMember()

    val memberService: MemberService = MemberServiceImpl(memberDAO)

    @Test
    fun getAll() {
        every { memberDAO.findAll() } returns listOf(user)
        // excercise
        val sut = memberService.getAll()
        val ret = listOf(user)
        //verify
        assertThat(sut).isEqualTo(ret)
    }

    @Test
    fun getMemberById() {
        every { memberDAO.findByNickName("Furmi") } returns user
        // excercise
        val sut = memberService.getMemberByNickname("Furmi")
        //verify
        assertThat(sut).isEqualTo(user)
    }

    @Test
    fun getMembersByGender() {
        every { memberDAO.findMembersByGender(Gender.MALE) } returns listOf(user)
        // excercise
        val sut = memberService.getMembersByGender(Gender.MALE)
        val ret = listOf(user)
        //verify
        assertThat(sut).isEqualTo(ret)
    }
}
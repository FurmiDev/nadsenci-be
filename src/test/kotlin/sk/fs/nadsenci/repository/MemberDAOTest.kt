package sk.fs.nadsenci.repository

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.ActiveProfiles
import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.info.MemberMock

@DataJpaTest
@ActiveProfiles("test")
class MemberDAOTest {

    @Autowired
    lateinit var entityManager: TestEntityManager

    @Autowired
    lateinit var memberDAO: MemberDAO

    private final val user = MemberMock.createMember()

    @Test
    fun getAll() {
        entityManager.persist(user)
        entityManager.flush()
        // excercise
        val sut = memberDAO.findAll()
        val ret = listOf(user)
        //verify
        assertThat(sut).isEqualTo(ret)
    }

    @Test
    fun getMemberById() {
    }

    @Test
    fun getMembersByGender() {
        entityManager.persist(user)
        entityManager.flush()
        // excercise
        val sut = memberDAO.findMembersByGender(Gender.MALE)
        val ret = listOf(user)
        //verify
        assertThat(sut).isEqualTo(ret)
    }
}
package sk.fs.nadsenci.resource.info

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.fs.nadsenci.model.Gender
import sk.fs.nadsenci.model.info.Member
import sk.fs.nadsenci.service.info.MemberService
import java.util.*

@RestController
@RequestMapping(value = ["member"])
class MemberResource(
    private val memberService: MemberService
) {

    @GetMapping("/all")
    fun getAllMembers(): ResponseEntity<MutableIterable<Member>> = ResponseEntity.ok(memberService.getAll())

    @GetMapping("/{memberId}")
    fun getMemberById(@PathVariable memberId: Long): ResponseEntity<Member> =
        ResponseEntity.ok(memberService.getMemberById(memberId))

    @GetMapping("/{gender}")
    fun getMembersByGender(@PathVariable gender: Gender): ResponseEntity<List<Member>> =
        ResponseEntity.ok(memberService.getMembersByGender(gender))
}
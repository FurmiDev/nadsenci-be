package sk.fs.nadsenci.resource.info

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sk.fs.nadsenci.model.info.Member
import sk.fs.nadsenci.service.info.MemberService

@RestController
@RequestMapping(value = ["member"])
class MemberResource(
  private val memberService: MemberService
) {

  @GetMapping("/all")
  fun getAllMembers():List<Member>? = memberService.getAll()

  @GetMapping("/{memberId}")
  fun getMemberById(@PathVariable memberId: String): Member? = memberService.getMemberById(memberId)

  @GetMapping("/{gender}")
  fun getMembersByGender(@PathVariable gender: String): List<Member>? = memberService.getMembersByGender(gender)
}
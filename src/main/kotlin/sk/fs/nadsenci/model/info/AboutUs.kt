package sk.fs.nadsenci.model.info

data class AboutUs(
    val artTeam: List<Member>,
    val organizationTeam: List<Member>,
    val description: String,
    val motto: List<String>
)
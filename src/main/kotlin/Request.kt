import kotlinx.serialization.Serializable

@Serializable
class Request(
    val ok: Boolean,
    val result: List<Update>
) {
}
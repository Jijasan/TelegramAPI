import kotlinx.serialization.Serializable

@Serializable
class Invoice(
    val title: String,
    val description: String,
    val start_parameter: String,
    val currency: String,
    val total_amount: Int
) {
}
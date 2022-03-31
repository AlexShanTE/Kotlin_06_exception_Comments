data class Report(
    val ownerId: Int = 0,
    val commentId: Int,
    val reason: ReportReasons?
)
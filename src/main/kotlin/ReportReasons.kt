enum class ReportReasons(val reasonNumber:Int) {
    SPAM(1),
    CHILD_PORNOGRAPHY(2),
    EXTREMISM(3),
    VIOLENCE(4),
    PROPAGANDA_OF_DRUGS(5),
    MATERIAL_FOR_ADULTS(6),
    INSULT(7),
    CALLS_FOR_SUICIDE(8);

    companion object {
        fun numberOfReason(value: Int?) :ReportReasons? = values().find { it.reasonNumber == value }
    }
}

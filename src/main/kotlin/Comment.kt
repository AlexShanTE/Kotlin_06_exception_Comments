import attachments.Attachment

data class Comment(
    val id: Int = 0,
    val postId: Int = 0,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    val attachments: Array<Attachment?> = emptyArray(),
    val parentsSlack: Array<Int> = emptyArray(),
)


object WallService {
    var postArray: Array<Post> = emptyArray<Post>()
    var comments: Array<Comment> = emptyArray<Comment>()
    var reports: Array<Report> = emptyArray()
    private var id = 1

    fun add(post: Post): Post {
        postArray += post.copy(id = id)
        id++
        return postArray.last()
    }

    fun update(post: Post): Boolean {
        var res: Boolean = false
        for ((index, element) in postArray.withIndex()) {
            if (element.id == post.id) {
                postArray[index] = post.copy(id = element.id, date = element.date)
                res = true
            }
        }
        return res
    }

    fun createComment(comment: Comment): Comment {
        for (post in postArray) {
            if (post.id == comment.postId) {
                comments += comment
                return comment
            }
        }
        throw PostNotFoundException("Post not found")
    }

    fun createReport(report: Report): Int {
        for (comment in comments) {
            if (report.reason == null) throw UnknownReportReasonException("Unknown number of report reason")
            if (report.commentId == comment.id) {
                reports += report
                return 1
            }
        }
        throw CommentNotFoundException("Comment not found")
    }
}
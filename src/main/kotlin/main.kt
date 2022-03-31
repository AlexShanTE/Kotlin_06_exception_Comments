import attachments.*
import attachments.mediaTypes.Audio

fun main() {
    val post = Post()
    val comment = Comment(id = 1,postId = 1)
    val report = Report(0, 1, ReportReasons.numberOfReason(3))
    val service = WallService
    ReportReasons.numberOfReason(1)

    service.add(post)
    service.createComment(comment)
    service.createReport(report)

    val value = service.createReport(report)
    println(report)
    println(value)

}
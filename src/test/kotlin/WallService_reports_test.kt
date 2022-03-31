import org.junit.Test
import org.junit.Assert.*

class WallService_reports_test {
    @Test(expected = UnknownReportReasonException::class)
    fun createReportTest_ShouldThrow_UnknownReportException() {
        val service = WallService
        val post = Post() // id = 1
        val comment = Comment(id = 0, postId = 1)
        val report = Report(0, 0, ReportReasons.numberOfReason(9999))
        service.add(post)
        service.createComment(comment)
        service.createReport(report)
    }

    @Test(expected = CommentNotFoundException::class)
    fun createReportTest_ShouldThrow_CommentNotFoundException() {
        val service = WallService
        val post = Post() // id = 1
        val comment = Comment(id = 0, postId = 1)
        val report = Report(0, commentId = 2, ReportReasons.numberOfReason(3))
        service.add(post)
        service.createComment(comment)
        service.createReport(report)
    }

    @Test
    fun createReportTest() {
        val service = WallService
        val post = Post() // id = 1
        val comment = Comment(id = 1, postId = 1)
        val report = Report(0, commentId = 1, ReportReasons.numberOfReason(3))
        val expected = 1
        service.add(post)
        service.createComment(comment)
        val actual = service.createReport(report)
        assertEquals(expected, actual)
    }
}
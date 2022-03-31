import org.junit.Test
import org.junit.Assert.*

class WallService_create_comment_test {
    @Test(expected = PostNotFoundException::class)
    fun createCommentTestShouldThrowException() {
        val service = WallService
        val post = Post() // id = 1
        val comment = Comment(postId = 0)
        service.add(post)
        service.createComment(comment)
    }

    @Test
    fun createCommentTestShouldNotThrowException() {
        val service = WallService
        val post = Post() // id = 1
        val comment = Comment(postId = 1)
        service.add(post)
        val expectedComment = service.createComment(comment)
        assertEquals(expectedComment, comment)
    }

}
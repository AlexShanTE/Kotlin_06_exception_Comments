import org.junit.Test
import org.junit.Assert.*

class WallServiceAddTest {
    @Test
    fun addPost() {
        val service = WallService
        val post = Post()
        val addedPost = service.add(post)

        val expectedPostId = 1

        assertEquals(expectedPostId,addedPost.id)
    }
}
import org.junit.Test
import org.junit.Assert.*

class WallServiceAddTest {
    @Test
    fun addPost() {
        val service = WallService
        val addedPost = service.add(Post())

        val expectedPostId = 1

        assertEquals(expectedPostId,addedPost.id)
    }
}
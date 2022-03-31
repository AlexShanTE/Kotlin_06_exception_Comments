import org.junit.Test
import org.junit.Assert.*

class WallServiceUpdateTest {
    @Test
    fun updateExisting() {
        val service = WallService()
        service.add(Post()) //id = 1
        service.add(Post()) //id = 2
        service.add(Post()) //id = 3
        val updatedPost = Post(id = 2, text = "BlaBlaBla")
        val result = service.update(updatedPost)
        assertTrue(result)
    }
    @Test
    fun updateNotExisting() {
        val service = WallService()
        service.add(Post()) //id = 1
        service.add(Post()) //id = 2
        service.add(Post()) //id = 3
        val updatedPost = Post(id = 0, text = "BlaBlaBla") //post with id 0 not exist
        val result = service.update(updatedPost)
        assertFalse(result)
    }
}
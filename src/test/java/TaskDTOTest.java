import com.example.todo_list_app.dto.TaskDTO;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class TaskDTOTest {

   @Test
    public void testTaskDTOInitialization() {
        TaskDTO taskDTO = new TaskDTO(1L, "Выполнить дз", false,
                "Учеба", LocalDate.of(2025, 05, 14));

        assertEquals(1L, taskDTO.getId());
        assertEquals("Выполнить дз", taskDTO.getDescription());
        assertFalse(taskDTO.isCompleted());
        assertEquals("Учеба", taskDTO.getCategory());
        assertEquals(LocalDate.of(2025, 05, 14), taskDTO.getDueDate());
    }
}

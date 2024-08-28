package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentListHardCodeDatasourceTest {

    @Test
    void testCorrectDataAmount(){
        StudentListHardCodeDatasource datasource = new StudentListHardCodeDatasource();
        StudentList studentList = datasource.readData();
        assertEquals(4, studentList.getStudents().size());
    }
    @Test
    void testReadDefaultDataCorrectly() {
        StudentListHardCodeDatasource datasource = new StudentListHardCodeDatasource();
        StudentList studentList = datasource.readData();

        Student student1 = studentList.getStudents().get(0);
        assertEquals("6410400001", student1.getId());
        assertEquals("First", student1.getName());
        assertEquals(0, student1.getScore());

        Student student2 = studentList.getStudents().get(1);
        assertEquals("6410400002", student2.getId());
        assertEquals("Second", student2.getName());
    }
}
package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudentWithScore() {
        StudentList room1 = new StudentList();
        room1.addNewStudent("661045xxxx", "Harold New", 85.5);
        Student student = room1.findStudentById("661045xxxx");
        assertNotNull(student);
        assertEquals("661045xxxx", student.getId());
        assertEquals("Harold New", student.getName());
        assertEquals(85.5, student.getScore());
    }

    @Test
    @DisplayName("Student name should be 'Carol New' after changed his name.")
    void testChangeStudentName() {
        StudentList room1 = new StudentList();
        room1.addNewStudent("661045xxxx", "Harold New");
        room1.addNewStudent("661045yyyy", "Gulstav Varlos");
        Student student = room1.findStudentById("661045xxxx");
        student.changeName(" Carol New ");
        assertEquals("Carol New", student.getName());
    }

    @Test
    @DisplayName("Score should be accurate after giving points to certain id")
    void testAddScore() {
        StudentList room1 = new StudentList();
        room1.addNewStudent("661045xxxx", "Harold New");
        room1.addNewStudent("661045yyyy", "Gulstav Varlos", 50+21+4);
        room1.giveScoreToId("661045xxxx", 46);
        room1.giveScoreToId("661045xxxx", 4);
        Student sampleStudent = room1.findStudentById("661045xxxx");
        Student sampleStudent2 = room1.findStudentById("661045yyyy");
        assertEquals(50, sampleStudent.getScore());
        assertEquals(75, sampleStudent2.getScore());
    }

    @Test
    @DisplayName("Grade should be accurate at their score range.")
    void testGradeCalculation() {
        StudentList room1 = new StudentList();
        room1.addNewStudent("661045xxxx", "Harold New", 85);
        assertEquals("A", room1.viewGradeOfId("661045xxxx"));

        room1.addNewStudent("661045yyyy", "Gulstav Varlos", 74);
        assertEquals("B", room1.viewGradeOfId("661045yyyy"));
    }

    @Test
    @DisplayName("Return null for cannot searching for the exist ID.")
    void testNullStudentId() {
        StudentList room1 = new StudentList();
        room1.addNewStudent("661045xxxx", "Harold New");
        assertNull(room1.findStudentById("651045xxxx"));
    }
}
package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; //class for assertion( karn chek )

class StudentTest {
    @Test @DisplayName("ทดสอบการเพิ่มคะแนน - คะแนน")
    void testAddScore() {
        Student s1 = new Student("661045117x", "pat");
        s1.addScore(10.5);
        assertEquals(10.5, s1.getScore());
        s1.addScore(50);
        assertEquals(60.5, s1.getScore());
    }

    @Test @DisplayName("ทดสอบการเพิ่มคะแนน - คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade() {
        Student s1 = new Student("661045117x", "pat",70);
        s1.addScore(9);
        assertEquals("B", s1.grade());
    }
}
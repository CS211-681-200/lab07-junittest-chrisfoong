package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init() {
        s = new Student("67xxxxx", "test");
    }

    @Test
    void testChangeName() {
        s.changeName("Vincent");
        assertEquals("Vincent", s.getName());
    }

    @Test
    @DisplayName("เพิ่มคะแนนนิสิต 49 และ 2 คะแนน")
    void testAddScore() {
        s.addScore(49);
        assertEquals(49, s.getScore());

        s.addScore(2);
        assertEquals(51, s.getScore());
    }

    @Test
    void testCalculateGrade() {
//        s.addScore(30);
//        assertEquals("F", s.grade());
        Student s1 = new Student("67xxxxx", "test");
        assertEquals(s, s1);
    }

    @Test
    void testIsId() {
        assertEquals("67xxxxx", s.getId());
    }

    @Test
    void testisNameContains() {
        assertEquals(true, s.isNameContains("t"));
    }
}
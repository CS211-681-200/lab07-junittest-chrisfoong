package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;
    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        studentList.addNewStudent("67xxxxx", "test");
        assertEquals("F", studentList.viewGradeOfId("67xxxxx"));
    }


    @Test
    void testFindStudentById() {
        studentList.addNewStudent("67xxxxx", "test");
        assertEquals("test", studentList.findStudentById("67xxxxx").getName());
    }

    @Test
    void testFilterByName() {
        studentList.addNewStudent("67xxxxx", "test");
        studentList.addNewStudent("67xxxx1", "test1");

        assertEquals(studentList.findStudentById("67xxxxx"), studentList.filterByName("test").findStudentById("67xxxxx"));
    }

    @Test
    void testGiveScoreToId() {
        studentList.addNewStudent("67xxxxx", "test");
        studentList.giveScoreToId("67xxxxx", 80);
        assertEquals("A", studentList.findStudentById("67xxxxx").grade());
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("67xxxxx", "test");
        studentList.giveScoreToId("67xxxxx", 80);
        assertEquals("A", studentList.viewGradeOfId("67xxxxx"));
    }

    @Test
    void testGetStudents() {
        studentList.addNewStudent("67xxxxx", "test");
        assertEquals(studentList.getStudents(), studentList.getStudents());
    }
}
package ku.cs.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource ds;
    @BeforeEach
    void init() {
        ds = new StudentHardCodeDatasource();
    }

    @Test
    void testStudentFindById() {
        assertEquals("First", ds.readData().findStudentById("6710400001").getName());
        assertEquals("Second", ds.readData().findStudentById("6710400002").getName());
        assertEquals("Third", ds.readData().findStudentById("6710400003").getName());
    }
}
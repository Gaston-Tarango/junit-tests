import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    @Before
    public void newStudentCreation() {
    }

    @Test
    public void addStudentTest() {
        Cohort newCohort = new Cohort();
        Student tron = new Student("tron", 2);
        newCohort.addStudent(tron);
        assertEquals(1, newCohort.getStudents().size());
    }

    @Test
    public void getStudentsListTest() {
        Cohort newCohort = new Cohort();
        Student tron = new Student("tron", 2);
        newCohort.addStudent(tron);
        System.out.println();
    }
}
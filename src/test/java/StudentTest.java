import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void createStudentTest() {
        Student gaston = new Student("gaston", 1);
        Student mateo = null;
        assertNotNull(gaston);
        assertNull(mateo);
    }

    @Test
    public void checkStudentProperties() {
        Student gaston = new Student("gaston", 1);
        gaston.addGrades(75);
        assertEquals("gaston",gaston.getName());
        assertEquals(1,gaston.getId());
        assertEquals(1, gaston.getGrades().size());
    }

    @Test
    public void checkGradeAverage(){
        Student gaston = new Student("gaston", 1);
        gaston.addGrades(80);
        gaston.addGrades(90);
        gaston.addGrades(100);
        assertEquals(90, gaston.getAverage(), 0.5);
    }

    @Test
    public void updatedGradeTest(){
        Student gaston = new Student("gaston", 1);
        gaston.addGrades(80);
        gaston.updateGrade(90, 0);
        assertEquals(90, (int) gaston.getGrades().get(0));
    }

    @Test
    public void removedGradeTest(){
        Student gaston = new Student("gaston", 1);
        gaston.addGrades(90);
        gaston.addGrades(100);
        gaston.removeGrade(1);
        assertEquals(1,gaston.getGrades().size());
    }


}
import static org.junit.jupiter.api.Assertions.*;

import CityTech.gui.gpacalculator.model.GradeStatus;
import com.jbbwebsolutions.http.utility.JSONGet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestHttpConnection {

    @Test
    @DisplayName("Test sever application for a failing grade")
    void _1stTestURL() {
        String url = "http://localhost:8080/grade/midsemester?grade=50";
        var actual = JSONGet.submitGet(url, String.class);
        var expected = "failing";
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Test sever application for a failing grade")
    void _2ndTestURL() {
        String url = "http://localhost:8080/grade/midsemester?grade=66";
        var actual = JSONGet.submitGet(url, String.class);
        var expected = "passing";
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Grade Status for an A")
    void _3rdTestURL() {
        String url = "http://localhost:8080/grade/gpa?grade=100";
        var gradeStatus = JSONGet.submitGet(url, GradeStatus.class);
        var actual = gradeStatus.getLetterGrade();
        var expected = "A";
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}


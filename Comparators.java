package edu.ccrm.util;
import edu.ccrm.domain.Course;
import edu.ccrm.domain.Student;
import java.util.Comparator;
/**
 * Common comparators used in CCRM.
 */
public final class Comparators {
    private Comparators() {
    }
    /**
     * Sort students by registration number.
     */
    public static Comparator<Student> byRegNo() {
        return (s1, s2) ->
                s1.regNo().compareToIgnoreCase(s2.regNo());
    }
    /**
     * Sort students by family name.
     */
    public static Comparator<Student> byFamilyName() {
        return Comparator.comparing(
                s -> s.name().family(),
                String.CASE_INSENSITIVE_ORDER
        );
    }
    /**
     * Sort courses by title.
     */
    public static Comparator<Course> byTitle() {
        return Comparator.comparing(
                Course::title,
                String.CASE_INSENSITIVE_ORDER
        );
    }
    /**
     * Sort courses by credits.
     */
    public static Comparator<Course> byCredits() {
        return Comparator.comparingInt(Course::credits);
    }
}

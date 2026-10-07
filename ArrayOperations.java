package edu.ccrm.util;
import java.util.ArrayList;
import java.util.List;
/**
 * Utility methods for handling String arrays.
 */
public final class ArrayOperations {

    private ArrayOperations() {
    }
    /**
     * Combines all elements into a single string.
     */
    public static String merge(String[] values, String delimiter) {

        if (values == null || values.length == 0) {
            return "";
        }

        if (delimiter == null || delimiter.isBlank()) {
            delimiter = " ";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            result.append(values[i]);

            if (i < values.length - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }
    /**
     * Returns array excluding first element.
     */
    public static String[] skipFirst(String[] values) {

        if (values == null || values.length <= 1) {
            return new String[0];
        }
        List<String> temp = new ArrayList<>();

        for (int i = 1; i < values.length; i++) {
            temp.add(values[i]);
        }
        return temp.toArray(new String[0]);
    }
    /**
     * Checks whether value exists.
     */
    public static boolean contains(String[] values, String target) {
        if (values == null || target == null) {
            return false;
        }
        for (String value : values) {
            if (target.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}

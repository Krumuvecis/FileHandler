package fileHandler;

/**
 * Helper class for checking null values.
 */
class NullCheck {
    private static final String DEFAULT_SEPARATOR = " : "; //mind the spaces around the colon

    protected static String nullDirectoryCheck(String directory) {
        return nullStringCheck(directory, "");
    }

    protected static String nullSeparatorCheck(String separator) {
        return nullStringCheck(separator, DEFAULT_SEPARATOR);
    }

    private static String nullStringCheck(String stringToCheck, String stringIfNull) {
        if (stringToCheck == null) {
            stringToCheck = stringIfNull;
        }
        return stringToCheck;
    }
}
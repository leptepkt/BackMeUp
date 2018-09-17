package net.backmeup.util;

public final class StringUtil {
    public static boolean isNotEmpty(String s) {
        return s != null && !s.isEmpty();
    }

    private StringUtil() {}
}

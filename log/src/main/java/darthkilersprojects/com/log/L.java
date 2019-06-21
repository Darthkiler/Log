package darthkilersprojects.com.log;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Darthkiler
 */

public abstract class L {

    private final static String TAG = "Darthkiler";

    public static <T> void show(T object) {
        show(object!=null?object.getClass().getName().split("\\.")[object.getClass().getName().split("\\.").length - 1]:"null", object);
    }

    public static <T> void show(String message, T object) {
        if (object instanceof List)
            showList(message, (List<?>) object);
        else if (checkNotNULL(object))
            Log.d(TAG, message + (char) Character.SPACE_SEPARATOR + object);
    }

    private static <T> boolean checkNotNULL(T arg) {
        boolean isNotNull = arg != null;
        if (!isNotNull)
            Log.d(TAG, "Crash null");
        return isNotNull;
    }

    private static void showList(String s, List<?> arg) {
        if (arg != null)
            for (Object arg1 : arg)
                show(s, arg1);
    }

    public static class Utils {
        @SafeVarargs
        @SuppressWarnings("varargs")
        public static <T> ArrayList<T> asList(T... a) {
            return new ArrayList<T>(Arrays.asList(a));
        }
    }
}

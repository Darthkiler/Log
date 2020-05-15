package darthkilersprojects.com.log;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Darthkiler
 */

public abstract class L {

    private final static String TAG = "Darthkiler";

    public static <T> void show(T object) {
        show(Utils.extractClassName(object), object);
    }

    public static <T> void show(String message, T object) {
        if (object instanceof List)
            showList(message, (List<?>) object);
        else if (checkNotNULL(object))
            Log.d(TAG, Utils.createMessage(message,object));
    }

    public static <T> void showAsToast(Context context,String message, T object) {
        Toast.makeText(context,Utils.createMessage(message,object),Toast.LENGTH_SHORT).show();
    }

    public static <T> void showAsToast(Context context, T object) {
        showAsToast(context,Utils.extractClassName(object),object);
    }

    private static <T> boolean checkNotNULL(T arg) {
        boolean isNotNull = arg != null;
        if (!isNotNull)
            Log.d(TAG, "null");
        return isNotNull;
    }

    private static void showList(String s, List<?> arg) {
        if (arg != null) {
            L.show(s,"{");
            for (Object object : arg)
                show(Utils.extractClassName(object), object);
            Log.d(TAG, "}");
        }
    }

    public static class Utils {
        @SafeVarargs
        @SuppressWarnings("varargs")
        public static <T> ArrayList<T> asList(T... a) {
            return new ArrayList<T>(Arrays.asList(a));
        }

        public static <T> String getConstantName(Class clazz, T arg) {
            for (Field field :
                    clazz.getFields()) {
                try {
                    if(field.get(null).equals(arg))
                        return field.getName();
                } catch (IllegalAccessException e) {
                    return "Ooops! Something went wrong!";
                }
            };
            return "Constant does't exist or isn't public";
        }

        static <T> String createMessage(String message, T object) {
            return message + " ---> " + object;
        }

        static String extractClassName(Object object) {
            return object != null ? object.getClass().getName().split("\\.")[object.getClass().getName().split("\\.").length - 1] : "null";
        }

    }
}

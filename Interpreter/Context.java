package Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> context = new HashMap<String, Integer>();

    public void setValue(String key, int value) {
        context.put(key, value);
    }

    public int getValue(String key) {
        return context.get(key);
    }
}

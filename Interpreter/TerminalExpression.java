package Interpreter;

public class TerminalExpression implements AbstractExpression {
    String key;

    TerminalExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(key);
    }
}

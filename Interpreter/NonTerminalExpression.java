package Interpreter;

public class NonTerminalExpression implements AbstractExpression {
    AbstractExpression left;
    AbstractExpression right;
    String operator;

    public NonTerminalExpression(AbstractExpression left, AbstractExpression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public int interpret(Context context) {
        switch (operator) {
            case "+":
                return left.interpret(context) + right.interpret(context);

            case "*":
                return left.interpret(context) * right.interpret(context);

            default:
                return 0;
        }
    }
}

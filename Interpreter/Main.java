package Interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setValue("a", 1);
        context.setValue("b", 2);
        context.setValue("c", 3);
        context.setValue("d", 4);

        // (a+b) * (c+d)
        AbstractExpression expression = new NonTerminalExpression(
                new NonTerminalExpression(
                        new TerminalExpression("a"),
                        new TerminalExpression("b"),
                        "+"),
                new NonTerminalExpression(
                        new TerminalExpression("c"),
                        new TerminalExpression("d"),
                        "+"),
                "*");

        System.out.println(expression.interpret(context));
    }
}

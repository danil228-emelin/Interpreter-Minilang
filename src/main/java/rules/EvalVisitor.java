package rules;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

import static java.util.Map.entry;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();
    Map<Integer, BiFunction<Integer, Integer, Integer>> BINARY_OPS = Map.ofEntries(
            entry(LabeledExprParser.MUL, (a, b) -> a * b),
            entry(LabeledExprParser.DIV, (a, b) -> a / b),
            entry(LabeledExprParser.ADD, Integer::sum),
            entry(LabeledExprParser.SUB, (a, b) -> a - b),
            entry(LabeledExprParser.GT, (a, b) -> (a > b) ? 1:0),
            entry(LabeledExprParser.LT, (a, b) -> (a < b)? 1:0),
            entry(LabeledExprParser.GE, (a, b) -> (a >= b)? 1:0),
            entry(LabeledExprParser.LE, (a, b) -> (a <= b)? 1:0),
            entry(LabeledExprParser.EQ, (a, b) -> (Objects.equals(a, b))? 1:0),
            entry(LabeledExprParser.NE, (a, b) -> (!Objects.equals(a, b))? 1:0)

    );

    private static final Map<Integer, BiFunction<Integer, Integer, Boolean>> COMPARISONS = Map.ofEntries(

    );



    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        int value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0;                          // return dummy value
    }

    /** INT */
    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** ID */
    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        System.out.printf("Variable %s doesn't exist,return 0\n",id);
        return 0;
    }


    /** '(' expr ')' */
    @Override
    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    @Override
    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression

        return BINARY_OPS.get(ctx.op.getType()).apply(left, right);
    }

    @Override
    public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression

        return BINARY_OPS.get(ctx.op.getType()).apply(left, right);
    }

    @Override
    public Integer visitEquality(LabeledExprParser.EqualityContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression

        return BINARY_OPS.get(ctx.op.getType()).apply(left, right);
    }

    @Override
    public Integer visitRelational(LabeledExprParser.RelationalContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression

        return BINARY_OPS.get(ctx.op.getType()).apply(left, right);
    }

    @Override
    public Integer visitIfStatement(LabeledExprParser.IfStatementContext ctx) {
        int condition = visit(ctx.ifStat().expr());
        System.out.println("Condition "+condition);
        if (condition>0){

        }
    return 0;
    }
}

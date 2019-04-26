import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Objects;

public class AST {

    public static void main(String[] args) throws IOException {
        parseJava(readFile(new File("test.txt")));
    }

    private static String readFile(File file) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }

    private static void parseJava(String code) throws IOException {
        hqlLexer lexer = new hqlLexer(new ANTLRInputStream(code));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        hqlParser parser = new hqlParser(tokens);
        MyVisitor visitor=new MyVisitor();
        visitor.visit(parser.program());
        System.out.println(visitor._queryData.QueryTables);
        System.out.println(visitor._queryData.selectList);
        System.out.println(visitor._queryData.OnStatement);
        System.out.println(visitor._queryData.WhereClauseStatement);
        System.out.println(visitor._queryData.OrderByList);
        System.out.println(visitor._queryData.GroupByList);
        System.out.println(visitor._queryData.HavingClauseStatement);
        System.out.println("hey");


    }

    private static void print(RuleContext ctx, boolean verbose) {
        explore(ctx, verbose, 0);
    }

    private static void explore(RuleContext ctx, boolean verbose, int indentation) {
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1
                && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = hqlParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                System.out.print(" | ");
            }
            System.out.println(ruleName + " --> " + ctx.getText());
        }
        for (int i=0;i<ctx.getChildCount();i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                explore((RuleContext)element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}

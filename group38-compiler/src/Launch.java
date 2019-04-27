import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
	public static void main(String[] args) {
		try {
			String source = "test.txt";
			CharStream cs = fromFileName(source);
			hqlLexer lexer = new hqlLexer(cs);
			CommonTokenStream token = new CommonTokenStream(lexer);
			hqlParser parser = new hqlParser(token);
			ParseTree tree = parser.program();

			MyVisitor visitor = new MyVisitor();
			visitor.visit(tree);
			visitor.print_symboltable();
		//	visitor.task2();
		//	System.out.println(visitor.exist("tab"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

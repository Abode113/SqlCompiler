import java.util.ArrayList;
import java.util.List;

public class conditionTree {

    TreeNode Head;

    conditionTree(){
        Head = new TreeNode();
    }

    public TreeNode build(List<String[]> Conditions){
        TreeNode Tree = new TreeNode();
        TreeNode Temp = new TreeNode();
        Tree = Temp;
        for (int i = 0; i < Conditions.size(); i++){
            if(Conditions.get(i)[0].equalsIgnoreCase("(")){
                //Tree = AddTempToNormal(Tree, Temp);
                Temp.right = new TreeNode();
                Temp = Temp.right;
            }
            /*
            if(Conditions.get(i)[0].equalsIgnoreCase(")")){
                Tree = AddTempToNormal(Tree, Temp);
            }
            */
            if(!Conditions.get(i)[0].equalsIgnoreCase("or")
                    && !Conditions.get(i)[0].equalsIgnoreCase("and")
                    && !Conditions.get(i)[0].equalsIgnoreCase("(")) {
                AddNode(Conditions.get(i), Temp);
            }
            if(Conditions.get(i)[0].equalsIgnoreCase("or")
                    ||Conditions.get(i)[0].equalsIgnoreCase("and")){
                AddNode(Conditions.get(i), Temp);
            }
        }
        return Tree;
    }

    public void AddNode (String[] Conditions, TreeNode Tree){
        if(Tree.left == null){
            Tree.left = new TreeNode();
            Tree.left.Data = Conditions[1];
            Tree.left.left = new TreeNode();
            Tree.left.left.Data = Conditions[0];
            Tree.left.right = new TreeNode();
            Tree.left.right.Data = Conditions[2];
        }else if (Tree.Data == null){
            Tree.Data = Conditions[0];
        }else if (Tree.right == null){
            Tree.right = new TreeNode();
            Tree.right.Data = Conditions[1];
            Tree.right.left = new TreeNode();
            Tree.right.left.Data = Conditions[0];
            Tree.right.right = new TreeNode();
            Tree.right.right.Data = Conditions[2];
        }
        System.out.println("hey");
    }

    public TreeNode AddTempToNormal(TreeNode Tree, TreeNode Temp){
        if(Tree.left == null){
            Tree = Temp;
        }else {
            TreeNode _temp = Tree;
            while(_temp.right != null){
                _temp = _temp.right;
            }
            _temp.right = Temp;
        }
        return Tree;
    }

}

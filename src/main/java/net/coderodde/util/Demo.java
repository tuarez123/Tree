package net.coderodde.util;

public final class Demo {

    public static void main(String[] args) {
        Tree<String> tree = new Tree<>();
        
        // Roots:
        
        TreeNode<String> root2 = tree.getPseudoRoot().addChild("v");
        
        // Children of 1st root:
      
        
        // Children of 2nd root:
        TreeNode<String> root2Child1 = root2.addChild("i");
        TreeNode<String> root2Child2 = root2.addChild("o");
        TreeNode<String> root2Child3 = root2.addChild("r");
        
        // Children of 2nd root, second child:
        TreeNode<String> root2Child2Child1 = root2Child1.addChild("d");
        TreeNode<String> root2Child2Child2 = root2Child1.addChild("c");
        
        
        TreeNode<String> root2Child2Child3 = root2Child2.addChild("n");
        
        TreeNode<String> root2Child2Child4 = root2Child3.addChild("z");
          TreeNode<String> root2Child2Child5 = root2Child3.addChild("e");
            TreeNode<String> root2Child2Child6 = root2Child3.addChild("x");
            
            
            
        TreeNode<String> root2Child2Child7 = root2Child2Child1.addChild("a");
        TreeNode<String> root2Child2Child8 = root2Child2Child1.addChild("s");
            
      
            TreeNode<String> root2Child2Child9 = root2Child2Child3.addChild("b");
            TreeNode<String> root2Child2Child10 = root2Child2Child3.addChild("u");
            
            
            TreeNode<String> root2Child2Child11 = root2Child2Child5.addChild("j");
            TreeNode<String> root2Child2Child12 = root2Child2Child5.addChild("t");
            
            TreeNode<String> root2Child2Child13 = root2Child2Child6.addChild("g");
            
            
           
        // Print the entire tree in a simple format:
        System.out.println("(Indentation communicates node depth.)");
        System.out.println(new SimpleTreeToStringConverter().toString(tree));
    }
}

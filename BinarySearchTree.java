public class BinarySearchTree
{
        BinarySearchTreeNode root;

        public BinarySearchTree()
        {
            root = null;
        }

        public void insert(String x)
        {
            if (root == null)
                root = new BinarySearchTreeNode(x, (BinarySearchTreeNode) null, (BinarySearchTreeNode) null);
            else
                {
                insert(x, root);
                }
                
        }

        public  void insert(String x, BinarySearchTreeNode node)
        {
            int spaceIndexForQueryKey = x.indexOf(" ");
            int spaceIndexForKey = node.getData().indexOf(" ");
            
            String queryKey = x.substring(0,spaceIndexForQueryKey);
	    String key =node.getData().substring(0,spaceIndexForKey );

            if ((queryKey.compareTo(key) <= 0)) // if data less than or equal to node.data add it to left
            {
                if (node.left == null)
                {

                    node.left = new BinarySearchTreeNode(x, null, null);
                }

                insert(x, node.left);
            }

            else
            {
                if (node.right == null) 
                {
                    node.right = new BinarySearchTreeNode(x, null, null);
                }

                insert(x, node.right);
            }
        }

        public void visit(BinarySearchTreeNode node)
        {
            System.out.println(node.getData());
        }
        /*
        public int getSize()
        {
            return getSize(root);
        }*/

       /* public int getSize(BinarySearchTreeNode node)
        {
            if (n)
        }*/

       public void printString(){
           if(root == null)
           {
               return;
           }

           System.out.println(root.getData());

           root.getLeft().toString();
           root.getRight().toString();
       }
}


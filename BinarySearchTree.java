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
                    System.out.println("khumodiatla");
                insert(x, root);
                System.out.println("khumo");

                }
        }

        public  void insert(String x, BinarySearchTreeNode node1)
        {
            String queryKey, key;

            if (x.charAt(6) == ' ' && node1.getData().charAt(6) == ' ')
            {
                queryKey = x.substring(0, 6);
                key = node1.getData().substring(0, 6);
            }
            else
                {
                    queryKey = x.substring(0, 7);
                    key = node1.getData().substring(0, 7);
                }

            if ((queryKey.compareTo(key) <= 0)) // if data less than or equal to node.data add it to left
            {
                if (node1.left == null)
                {

                    node1.left = new BinarySearchTreeNode(x, null, null);
                }

                insert(x, node1.left);
            }

            else
                {
                if (node1.right == null) {
                    node1.right = new BinarySearchTreeNode(x, null, null);
                }

                insert(x, node1.right);
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


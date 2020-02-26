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

            if ((queryKey.compareTo(key) <= 0)) 
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
        
        public BinarySearchTreeNode find(String d)
        {
        	if(root==null)
        		return null;
        	else
        		return find(d,root);
        }
        
        public BinarySearchTreeNode find(String d,BinarySearchTreeNode node)
        {
        	int spaceIndexForQueryKey = d.indexOf(" ");
            	int spaceIndexForKey = node.getData().indexOf(" ");
            	int operationCount =0;
            
            	String queryKey = d.substring(0,spaceIndexForQueryKey);
	    	String key =node.getData().substring(0,spaceIndexForKey );
	    	
	    	if(queryKey.compareTo(key) == 0)
	    	{	
	    		operationCount++;
	    		return node;
	    	}
	    	
	    	if(queryKey.compareTo(key)<0)
	    	{
	    		operationCount++;
	    		return(node.left == null) ? null: find(d, node.left);
	    	}
	    	
	    	else
	    	{
	    		operationCount++;
	    		return(node.right == null) ? null: find(d, node.right);
	    	}
	    	
	    	//System.out.println("The number of operations is: "+operationCount);
	    	

        }
        

        /*public void visit(BinarySearchTreeNode node)
        {
            System.out.println(node.getData());
        }
        
        public void inOrder()
        {
         	inOrder(root);
        }
        
        public void inorder(BinarySearchTreeNode node)
        {
        	if(node != null)
        	{
        		inOrder(node.left);
        		visit(node);
        		inOrder(node.right);
        	}
        }*/
        
        
        /*
        public int getSize()
        {
            return getSize(root);
        }*/

       /* public int getSize(BinarySearchTreeNode node)
        {
            if (n)
        }*/

      	public void printAllAreas()
      	{
           if(root == null)
           {
               return;
           }

           System.out.println(root.getData());
	   //root.inOrder(root);
       }
       
       public void printAreas(String stage, String day, String startTime)
       {

                String key = stage + "_" + day + "_" + startTime;
                int x = key.length();
                BinarySearchTree a = new BinarySearchTree();
                //System.out.println(a.find(key).getData().substring(x+1));

       }
       
}


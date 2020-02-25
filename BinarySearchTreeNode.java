class BinarySearchTreeNode
{
    private String data;
    BinarySearchTreeNode left;
    BinarySearchTreeNode right;

    public BinarySearchTreeNode(String data, BinarySearchTreeNode left,BinarySearchTreeNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinarySearchTreeNode getLeft()
    {
        return left; // return new BinarySearchTreeNode(left);
    }

    public BinarySearchTreeNode getRight()
    {
        return right; // return new BinarySearchTreeNode(right);
    }

    public String getData()
    {
        return data;
    }

    public int compareTo(BinarySearchTreeNode queryObj)
    {
        //BinarySearchTreeNode<String> queryObj = (BinarySearchTreeNode<String>) obj;

        return (data.compareTo(queryObj.data));
    }
}


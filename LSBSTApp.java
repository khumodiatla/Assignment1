import java.io.File;
import java.util.Scanner;

public class LSBSTApp
{
    public static void main(String[] args)
    {
        System.out.println("1_1_00 1".substring(6+1));
        try
        {
            File file = new File("/home/m/mtlkhu004/Documents/UCT/CSC2001F/Assignments/Assign 1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
            Scanner scannerReader = new Scanner(file);

            BinarySearchTree a = new BinarySearchTree();

            while (scannerReader.hasNextLine())
            {
                //root = new BinarySearchTreeNode(scannerReader.nextLine(), null,null);
                a.insert(scannerReader.nextLine());
                  System.out.println(a.root.getData());
                  //System.out.println(a.root.left.getData());
                System.out.println(a.root.right.getData());
               // if(a.)


            }
            scannerReader.close();
            a.printString();

        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}


import java.io.File;
import java.util.Scanner;

class LSBSTApp
{
    public static void main(String[] args)
    {
        BinarySearchTree a = new BinarySearchTree();
        try
        {
            File file = new File("/home/m/mtlkhu004/Documents/UCT/CSC2001F/Assignments/Assign 1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
            Scanner scannerReader = new Scanner(file);
	   
            while (scannerReader.hasNextLine())
            {
                a.insert(scannerReader.nextLine());
                System.out.println(a.root.getData());
                //System.out.println(a.root.left.getData());
                System.out.println(a.root.right.getData());
               // if(a.)


            }
            scannerReader.close();

        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
       if(args.length ==0)
         	a.printAllAreas();
       else
          	a.printAreas(args[0],args[1],args[2]);
    }
    

}


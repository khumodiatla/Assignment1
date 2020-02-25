import java.io.File;
import java.util.Scanner;
class LSArrayApp
{
    private static String[] array;
    private static int operationCount=0;

    public static void main(String[] args)
    {
        array = new String[2976];
        
        try
        {
            File file = new File("/home/m/mtlkhu004/Documents/UCT/CSC2001F/Assignments/Assign 1/src/Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
            Scanner scannerReader = new Scanner(file);



            while(scannerReader.hasNextLine())
            {
                for(int i=0; i<2976;i++)
                {
                    array[i] = scannerReader.nextLine();
                }
            }
            scannerReader.close();
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

     	 LSArrayApp p = new LSArrayApp();
       // p.printAreas(args[0],args[1],args[2]);
        //p.printAreas(args[0],args[1],args[2]);
        if(args.length ==0)
	        p.printAllAreas();
        if(args.length==3)
        	p.printAreas(args[0],args[1],args[2]);
        	

    }

    public void printAreas(String stage, String day, String startTime)
    {

                String key = stage + "_" + day + "_" + startTime;
                int x = key.length();
                int noAreaCount=0;
                int operationCount =0;
                
                for(int i =0;i<array.length;i++)
                {
                    if(key==array[i].substring(0,x))
                    {
                    	noAreaCount++;
                    	operationCount++;
                    	System.out.println(array[i].substring(x+1));
                    }
                
                    else if(!(noAreaCount==0))
                        {
                        System.out.println("Areas not found");
                        //break;
                        }
                }
            
        //System.out.println(operationCount);

    }


    public void printAllAreas()
    {
        for (int i =0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}

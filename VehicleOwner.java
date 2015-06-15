/**
 * Description of class VehicleOwner
 * Contract      : VehicleOwner:(String,String)->(String,String)
 * @Purpose      : To get the vehicle number and its type to get the 
 *                 ticket or smartcard to cross the toll plaza.
 * @author       : M-125 Batch-3        
 * @version      : 1.0
 * @Class Name   : VehicleOwner
 * @creation Date: 9-Feb-2011
 */
public class VehicleOwner
{
    //declaring the vehicle number as String
    public String vehicleNumber;
    //declaring the vehicle type as String
    public String vehicleType;
    //defining an object for the Ticket class
    public Ticket t=new Ticket();
    //defining an object for the SmartCard class
    public SmartCard s=new SmartCard();
    
    // Default constructor for objects of class VehicleOwner
    public VehicleOwner()
    {
    }
    
    /**
     * Constructor for objects of class VehicleOwner
     * Purpose              : To set the vehicle number and the vehicle type 
     *                        using parameters
     * @param vehicleNumber : a parameter to set the vehicle Number
     * @param vehicleType   : a parameter to set the vehicle type
     */
    public VehicleOwner(String vehicleNumber,String vehicleType)
    {
        if(vehicleType.equalsIgnoreCase("car")||vehicleType.equalsIgnoreCase("auto")||vehicleType.equalsIgnoreCase("bus")||vehicleType.equalsIgnoreCase("truck"))
        {
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        this.t=null;
        this.s=null;
        }
        else
          System.out.println("Enter the Correct Vehicle Type");
    }
}

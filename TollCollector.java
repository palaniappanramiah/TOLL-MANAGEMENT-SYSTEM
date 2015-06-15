import java.util.ArrayList;

/**
 * Description of class TollCollector
 * @Purpose: To calculate the correct fare and to
 *           issue the ticket to the vehicle owner.
 * @author M-125 Batch-3
 * @version 1.0
 * @Class name: TollCollector
 * @Creation Date: 10-Feb-2011
 */
class TollCollector
{
  //declaring the toll fare as integer
  public int fare=0;
  //declaring the revenue generated as integer
  public int revenue=0;
  //declaring the vehicles' count as integer
  public int vehiclecount=0;
  
  //default constructor for objects of class TollCollector
  public TollCollector()
    {
    }
  
  /**
     * purpose              : To calculate the fare and to issue the ticket 
     *                        according to the ticket type
     * Contract             : issueTicket:(vehicleOwner,Ticket,String)->String
     * Header               : issueTicket(VehicleOwner ,Ticket ,String)
     * issueTicket method   : (VehicleOwner vo,Ticket t, String)
     * @param vo            : A parameter to represent whole vehicleowner class values
     * @param t             : A parameter to represent whole Ticket class values
     * @param Type          : A parameter to define the type of ticket                    
     * @return String
     */
  public String IssueTicket(VehicleOwner vo,Ticket t,String Type)
  {
   System.out.println(t.AssgnTicket(Type));
   if (vo.vehicleType.equalsIgnoreCase("car"))
   {
     if (Type.equalsIgnoreCase("one way"))
       fare=17;
     if (Type.equalsIgnoreCase("two way")) 
       fare=30;
     if (Type.equalsIgnoreCase("multi way")) 
       fare=50;
   }
   if (vo.vehicleType.equalsIgnoreCase("auto"))
   {
     if (Type.equalsIgnoreCase("one way"))
       fare=12;
     if (Type.equalsIgnoreCase("two way")) 
       fare=20;
     if (Type.equalsIgnoreCase("multi way")) 
       fare=40;
   }
   if (vo.vehicleType.equalsIgnoreCase("truck") || vo.vehicleType.equalsIgnoreCase("bus"))
   {
     if (Type.equalsIgnoreCase("one way"))
       fare=75;
     if (Type.equalsIgnoreCase("two way")) 
       fare=145;
     if (Type.equalsIgnoreCase("multi way")) 
       fare=200;
   }
   revenue+=fare;
   vehiclecount++;
   return ("FARE =" +fare);
  } 
}
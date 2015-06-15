/**
 * Description of class Admin:
 * @Purpose:To issue the new SmartCard or renew SmartCard and also to view
 *          the revenue collected by the toll collector and to view the vehicles' count.
 * @author M-125 Batch-3
 * @version 1.0
 * @Class name: Admin
 * @Creation Date: 11-Feb-2011
 */
class Admin
{
  public int fare1=0;
  public int revenue1=0;
  
  //Default constructor for objects of class Admin
  public Admin()
  {
  }
  
  /**
     * purpose              : To issue the SmartCard according to the vehicle type
     * Contract             : IssueSmartCard:(VehicleOwner,SmartCard)->String
     * Header               : IssueSmartCard(VehicleOwner ,SmartCard)
     * IssueSmartCard method: (VehicleOwner vo, SmartCard s)
     * @param vo            : A parameter to represent whole vehicleowner class values
     * @param s             : A parameter to represent whole SmartCard class values
     * @return String
     */
  public String IssueSmartCard(VehicleOwner vo,SmartCard s)
  {
   System.out.println(s.AssgnCard());
   if (vo.vehicleType.equalsIgnoreCase("car"))
         fare1=1250;
   if (vo.vehicleType.equalsIgnoreCase("auto"))
         fare1=1000;
   if (vo.vehicleType.equalsIgnoreCase("truck") || vo.vehicleType.equalsIgnoreCase("bus"))
         fare1=5000;
   revenue1+=revenue1;
   return ("Fare ="+fare1);
  }
  
   /**
     * purpose              : To renew the SmartCard according to the vehicle type
     * Contract             : RenewSmartCard:(VehicleOwner,SmartCard,CardNo)->String
     * Header               : RenewSmartCard(VehicleOwner ,SmartCard, CardNo)
     * RenewSmartCard method: (VehicleOwner vo, SmartCard s, CardNo)
     * @param vo            : A parameter to represent whole vehicleowner class values
     * @param s             : A parameter to represent whole SmartCard class values
     * @param CardNo        : A parameter to define the smartcard number
     * @return String
     */
  public String RenewSmartCard(VehicleOwner vo,SmartCard s,int CardNo)
  {
    System.out.println(s.RenewCard());
    if (vo.vehicleType.equalsIgnoreCase("car"))
         fare1=1250;
   if (vo.vehicleType.equalsIgnoreCase("auto"))
         fare1=1000;
   if (vo.vehicleType.equalsIgnoreCase("truck") || vo.vehicleType.equalsIgnoreCase("bus"))
         fare1=5000;
   revenue1+=revenue1;
   return "Fare ="+fare1;
  }
  
  public String getRevenue(TollCollector tc,Admin a)
  {
    tc.revenue+=revenue1;
    return ("REVENUE = " +tc.revenue);
  }
  
  public String getVehiclesCount(TollCollector tc)
  {
    return ("VEHICLES' COUNT ="+tc.vehiclecount);
  }
}
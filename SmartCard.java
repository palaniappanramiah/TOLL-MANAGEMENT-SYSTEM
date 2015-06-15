import java.util.Calendar;
import java.text.SimpleDateFormat;


/**
 * Description of class SmartCard: 
 * Contract: SmartCard:(Void)->String
 * @Purpose: To provide new SmartCard for vehicles
 *           and to renew the SmartCard.
 * @author  M-125 Batch-3 
 * @version 1.0
 * @Class name: SmartCard
 * @Creation Date: 9-Feb-2011
 */
class SmartCard
{
 //initilizing default starting SmartCardnumber as 5000
  private static int StartingCardNo=5000;
  //declaring integer variable for SmartCard number
  public int CardNo;
  //declaring String variable for SmartCard's issue date
  public String StartDate;
  //declaring String variable for SmartCard's expiry date
  public String EndDate;
  //initilizing default date format as dd-mm-yyyy
  public String Date_Format = "dd-MM-yyyy";
  //Creating an object for the date format
  SimpleDateFormat sdf = new SimpleDateFormat(Date_Format);
  
  //Default constructor for objects of class SmartCard
  public SmartCard()
  {
  }
  
  
     /**
     * purpose              : To assign the SmartCard for the required vehicle type
                              and to calculate the end date.
     * Contract             : AssgnCard:(Void)->String
     * Header               : AssgnCard()
     * AssgnCard method    : ()
     * @return String
     */
  public String AssgnCard()
  {
    Calendar cal=Calendar.getInstance();
    this.CardNo=StartingCardNo++;
    this.StartDate=sdf.format(cal.getTime());
    cal.add(Calendar.MONTH ,1);
    this.EndDate=sdf.format(cal.getTime());
    return ("\n CARD NUMBER = "+CardNo+"\n ISSUE DATE = "+StartDate+"\n EXPIRY DATE = "+EndDate);
  }

   /**
     * purpose              : To renew the SmartCard for the required SmartCard type
                              and to calculate the end date.
     * Contract             : RenewCard, (Void)->String
     * Header               : RenewCard()
     * RenewCard method     : ()
     * @return String
     */
  public String RenewCard()
    {
        Calendar cal=Calendar.getInstance();
        this.StartDate=sdf.format(cal.getTime());
        cal.add(Calendar.MONTH ,1);
        this.EndDate=sdf.format(cal.getTime());
        return ("\n CARD NUMBER = "+CardNo+"\n ISSUE DATE = "+StartDate+"\n EXPIRY DATE = "+EndDate);
    }
}

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Description of class Ticket:
 * Contract: Ticket:(String)->String
 * @Purpose: To provide new ticket for vehicles
 * @author M-125 Batch-3
 * @version 1.0
 * @Class name: Ticket
 * @creation Date: 9-Feb-2011
 */
public class Ticket
{
  //initilizing default starting ticket ID as 1000
  private static int StartingTicketID=1000;
  //declaring integer variable for ticket ID
  public int TicketID;
  //declaring ticket type as String
  public String TicketType;
  //declaring ticket issue time as String
  public String IssueTime;
  //declaring ticket expiry time as String
  public String ExpiryTime;
  
  //Default constructor for objects of class Ticket
  public Ticket()
  {
  }
  
  /**
     * purpose            : To assign the ticket with the required ticket type and to calculate
     *                      end date and assign a ticket ID
     * Contract           : AssgnTicket:(String)->String
     * Header             : AssgnTicket(String)
     * AssgnTicket method : (String)
     * @param ticketType  : a parameter to define the type of ticket
     * @return String
     */
  public String AssgnTicket(String Type)
  {
    this.TicketID=StartingTicketID++;
    this.TicketType=Type;
    Calendar cal = Calendar.getInstance();
    String Date_Format = "dd-MM-yyyy HH:mm:ss";
    SimpleDateFormat sdf = new SimpleDateFormat(Date_Format);
    this.IssueTime=sdf.format(cal.getTime());
    cal.add(Calendar.DAY_OF_YEAR, 1);
    this.ExpiryTime=sdf.format(cal.getTime());
    return(" TICKET ID = "+TicketID+"\n TICKET TYPE =  "+TicketType+"\n TICKET ISSUED TIME =  "+IssueTime+"\n TICKET EXPIRY TIME =  "+ExpiryTime);
  }
}
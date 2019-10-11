
public class Appointment 
{//Fields
    private int appHour;
    private String appDesc;
//Constructors  
    public Appointment(String appTime,String appDesc){
    }    
    
    public Appointment(int appHour,String appDesc){
    }

//~ Methods ...............................................................
    public void setDescription(String newDesc){
    appDesc=newDesc;
    }
///////////////////////////////////////////////////////////////     
    public void setHour(int newHour){
    appHour=newHour;
    }
///////////////////////////////////////////////////////////////      
    public int setTime(String appTime){
    int lastS=0;
    if(appTime.indexOf('p')!=-1){
    lastS=appTime.lastIndexOf('p');
    String time=appTime.substring(0,lastS);
    lastS=Integer.parseInt(time);
    if(lastS!=12){
    lastS+=12;
    }
    }
    if(appTime.indexOf('a')!=-1){
    lastS=appTime.lastIndexOf('a');
    String time=appTime.substring(0,lastS);
    lastS=Integer.parseInt(time);
    if(lastS==12){
    lastS=0;
    }
    }
    return lastS;
    }
/////////////////////////////////////////////////////////////// 
    public String getDescription(){
      return this.appDesc;
     }
///////////////////////////////////////////////////////////////     
    public int getHour(){
      return this.appHour;
    }
/////////////////////////////////////////////////////////////// 
    //public String toString(){
    //String fullApp =setTime()+": "+getDescription()+".";
    //return fullApp;
    //}
///////////////////////////////////////////////////////////////     

   
}

package  dmg.cells.network ;

import java.io.Serializable ;

/**
  *  
  *
  * @author Patrick Fuhrmann
  * @version 0.1, 15 Feb 1998
  */
public class PingMessage implements Serializable {
   static final long serialVersionUID = -2899727151648545028L;
   
   private final long    _millis ;   
   private final byte [] _payload ;
   
   private boolean _wayback;
   
   public PingMessage(){
	   this(0);
   }
   public PingMessage( int payloadSize ){
      _payload = new byte [payloadSize] ;
      _millis  = System.currentTimeMillis() ;
   }
   public void    setWayBack(){ _wayback = true ; }
   public boolean isWayBack(){ return _wayback ; }
   public long getTransferTime(){
     return System.currentTimeMillis() - _millis ;
   }
   public int getPayloadSize(){ return _payload.length ; }
   public String toString(){
      return "Transfer Time = "+getTransferTime()+
             " (payload="+_payload.length+" bytes)" ;
   
   }
}

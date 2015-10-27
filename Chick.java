class Chick implements Animal 
{     
         
     private String myType;     
     private String mySound; 
     private int x;     
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;
         x=(int)(Math.random()*2);
         if(x==0){
         	mySound=sound1;
         }
         if(x==1){
         	mySound=sound2;
         }
             
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 

     

}

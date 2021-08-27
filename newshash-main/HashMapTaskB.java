import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.util.Map.*;
import java.util.Iterator;

public class HashMapTaskB{
	    static Scanner input=new Scanner(System.in);
	     int count;
//Question1		
	public HashMap<Integer,String> emptyMap(){
   	  HashMap<Integer,String> mapOne=new HashMap<Integer, String>(); 
	  return mapOne;	  
    }
//Question2 
	    
    public HashMap<String,String> addString(){
   	  HashMap<String,String> hashMap=new HashMap<String, String>(); 
   	  System.out.println("enter the count");
   	  count=input.nextInt();
   	  
   	  for(int i=0;i<count;i++){
   	  System.out.println("Enter the key");
   	  String key=input.nextLine();
   	  System.out.println("Enter the value");
   	  String value=input.nextLine();
   	  hashMap.put(key,value);
   	  }
	  return hashMap;	  
    }  
//Question3	
	public HashMap<Integer,Integer> addInt(){
	 HashMap<Integer,Integer> mapThree=new HashMap<Integer,Integer>();
	 System.out.println("enter tha number of pairs");
	 count=input.nextInt();
	
     	for(int run=0;run<count;run++){
     		System.out.println("enter the keys");
     		int keys=input.nextInt();
     		System.out.println("enter the values");
     		int values=input.nextInt();
     		
     		mapThree.put(keys,values);
     	}
    return mapThree;
   }
//Question4

	public HashMap<String,Integer> addStringInt(){
	 HashMap<String,Integer> mapFour=new HashMap<String,Integer>();
	 System.out.println("enter the number of pairs");
	 count=input.nextInt();
	 
	 	for(int run=0;run<count;run++){
	 	  System.out.println("enter the stringKey");
	 	  String stringKey=input.next();
	 	  System.out.println("enter the integerKey");
	 	  int integerKey=input.nextInt();
	 	  
	 		mapFour.put(stringKey,integerKey);
	 	}
	 return mapFour;
	}
/*Question5
	public void checkValue(){
	
	 HashMap<String,String> map=new HashMap<String,String>();
	 for(int i=0; i<3; i++){
	 System.out.println("1.enter the key");
	 String name=input.next();
	 System.out.println("2.enter address  ");
	 String address=input.next();
	   map.put(name,address);
	   }
	 } */ 
//Question6	 	
	public HashMap<String,String> addNullValue(HashMap<String,String> hashMap){
	
	 		hashMap.put("H",null);
	 	
     return hashMap;
   }
//Question7
	public HashMap<String,String> addNullKey(HashMap<String,String> hashMap){
	        hashMap.put(null,"sr");
		
	 return hashMap;
	}	 
//Question8 
    public  HashMap<String,String>keyCheck(HashMap<String,String> hashMap,String keyChecking){
		
		 hashMap.containsKey(keyChecking);
		return  hashMap;	
	 }

//Question9 
    public  HashMap<String,String>valueCheck(HashMap<String,String> hashMap,String valueChecking){
	   	
		 hashMap.containsValue(valueChecking);
		return  hashMap;
		}
//Question10 doubt
  
    public HashMap<String,String> change( HashMap<String,String> hashMap){
                        
                        
       return  hashMap;       
   } 
    
//Question11         
	public HashMap<String,String> getValuesUseExistKey(HashMap<String,String> hashMap,String existKey){
	   //HashMap<String,String> mapEleven=new HashMap<String,String>();
	
	  System.out.println( hashMap.get(existKey));
    	return hashMap;
    	}	
//Question12
	public HashMap<String,String> getValuesUseNonExist(HashMap<String,String> hashMap,String nonExistKey){
	   //HashMap<String,String> mapTwelve=new HashMap<String,String>();
	
	      
	  System.out.println(hashMap.getOrDefault(nonExistKey, "sriMurugan"));
    	return hashMap;
    	}		
//Question13		
	
	public HashMap<String,String> getValuesUseNonExistKey(HashMap<String,String> hashMap, String  nonExistKey){
	  // HashMap<String,String> mapThirteen=new HashMap<String,String>();
	
	   System.out.println(hashMap.getOrDefault( nonExistKey, "ZOHO"));
    	return hashMap;
}

//Question14

 public HashMap<String,String> removeExistingKey(HashMap<String,String> hashMap, String stringKesy){
	   
	        System.out.println("before map"+ hashMap); 
	       
			 System.out.println(hashMap.remove(stringKesy));
	  
    	return hashMap;
         } 
 //Question15           
  public HashMap<String,String> removeValue (HashMap<String,String> hashMap,String keyName, String valueName){
	   //HashMap<String,String> mapFifteen=new HashMap<String,String>();
	
	           hashMap.remove(keyName, valueName );
	           
	        
    	return hashMap;
         } 
             
//Question16
   public HashMap<String,String> replaceValueSame( HashMap<String,String> hashMap, String keyName, String valueName){
	   
	        
	  System.out.println("before map"+ hashMap); 
      System.out.println(hashMap.replace(keyName, valueName ));
	     
    	return hashMap;
         }       
//Question17
   public HashMap<String,String> replaceValueSome (HashMap<String,String> hashMap,String keyName, String oldValue, String newValue){
	  
	           hashMap.replace(keyName, oldValue, newValue );
	          
    	return hashMap;
         } 
 //Questio18             
 
 public HashMap<String,String> transferAll (HashMap<String,String> hashMap){
	  // HashMap<String,String> mapEighteen=new HashMap<String,String>();
	
	      
	        
	  System.out.println("before map"+ hashMap); 
    
	      
	    HashMap<String,String> secondMap=new HashMap<String,String>();
	       secondMap.putAll(hashMap);
	       System.out.println("after map"+secondMap);
    	return secondMap;
         }               
                                           
//question19
      public  HashMap<String,String>  iterateMap(HashMap<String,String> hashMap){
        //HashMap<String,String> maps=new HashMap<String,String>();
        
 
         
            for(Map.Entry entry: hashMap.entrySet()) {
              System.out.println(entry.getKey() + " " + entry.getValue());
            }
        return hashMap;
    }  
            
//Question20       
 public  HashMap<String,String> removeEntries(HashMap<String,String> hashMap){       
          hashMap.clear();
        return hashMap;
  }
            
                         		
 

	public static void main(String[] args){
	     HashMapTaskB obj=new HashMapTaskB();
	     System.out.println("enter your choice");
	     int choice=input.nextInt();
	     
	switch(choice){
		case 1:
		       
		       HashMap<Integer,String> mapOne=obj.emptyMap();
		       System.out.println("map=" +mapOne);
		       System.out.println("map size=" + mapOne.size());
		       System.out.println("Run successfully");
		break;
		
		
		case 2:
		        Map<String,String>hashMap=obj.addString();
		        System.out.println("HashMap" +hashMap);
		        System.out.println("HashMap size" +hashMap.size());
		        System.out.println("Run successfully");
		break;
		
		
		case 3:  
		       HashMap<Integer,Integer> mapThree=obj.addInt();
		       System.out.println("HashMap="+mapThree);
		       System.out.println("HashMap size="+mapThree.size());
		       System.out.println(" Run successfully");
		break;
		
		case 4:
			   
		      HashMap<String,Integer> mapFour=obj.addStringInt();
		      System.out.println("HashMap="+mapFour);
		      System.out.println("HashMap size="+mapFour.size());
		      System.out.println(" Run successfully");
		break;
		
	 /* case 5:
		       obj.checkValue();
		       System.out.println(" Run successfully");
		break;*/
		
		case 6:
		       
		      hashMap=obj.addNullValue(addString);
		      System.out.println("HashMap="+hashMap);
		      System.out.println("HashMap size="+hashMap.size());
		      System.out.println("Run successfully");
		break;
		
		
		case 7:
			   
		      HashMap<String,String> hashMap=obj.addNullValues();
		      System.out.println("HashMap="+hashMap);
		      System.out.println("HashMap size="+hashMap.size());
		      System.out.println("Run successfully");
		break;
		
		case 8:
		       System.out.println("enter the one key for checking");
		       String keyChecking=input.next();
			   
		      HashMap<String,String> hashMap=obj.keyCheck(keyChecking);
		      System.out.println("HashMap="+hashMap);
		      System.out.println("HashMap size="+hashMap.size());
		      System.out.println("Run successfully");
			 // System.out.println(mapEigth.containsKey(hashMap));  
			  
		break;
		 case 9:
			  System.out.println("enter the value for checking"); 
			  String valueChecking=input.next();
		      HashMap<String,String>  hashMap=obj.valueChecking(valueChecking);
		      System.out.println("HashMap="+ hashMap);
		      System.out.println("HashMap size="+ hashMap.size());
		      System.out.println("Run successfully");
			 // System.out.println(mapNine.containsKey(animalKey));  
		
		       System.out.println(" Run successfully");
		break;
	
		case 10:
	          
              
		      HashMap<String,String> hashMap=obj.change();
		      System.out.println("HashMap="+hashMap);
		      System.out.println("HashMap size="+hashMap.size());
		      System.out.println("Run successfully");
			  
		       
		break;
		
		case 11:
		      System.out.println("enter the key to get the values");
		      String existKey=input.next();
		   
		     HashMap<String,String>hashMap=obj.getValuesUseExistKey(existKey);
		       System.out.println(" Run successfully");
		break;
		
	   case 12:
	         System.out.println("enter the nonExist key");
	         String nonExistKey=input.next();
		   
		     HashMap<String,String>mapTwelve=obj.getValuesUseNonExist(nonExistKey);
		     System.out.println(" Run successfully");
		      
		break;
		
		case 13:
		       
		      
		        
		     System.out.println("enter the nonExist key");
	          nonExistKey=input.next();
		   
		     HashMap<String,String>HashMap=obj.getValuesUseNonExistKey( nonExistKey);
		     System.out.println("HashMap="+ hashMap);
		      System.out.println("HashMap size="+ hashMap.size());
		      System.out.println("Run successfully");
		  
		break;
		
		
		case 14:
		     System.out.println("enter the key");
		     String stringKesy=input.next();
		     HashMap<String,String>mapFourteen=obj.removeExistingKey(stringKesy);
		     System.out.println(" after HashMap="+hashMap);
		     System.out.println(" after HashMap size="+HashMap.size());
		     System.out.println(" Run successfully");
		       
		 
		break;
		
		case 15:
		     
		      System.out.println("enter the key");
		    
		      String  keyName= input.next(); 
		      
		      
		     System.out.println("enter the values");
		        String  valueName= input.next(); 
		   
		     HashMap<String,String>hashMap=obj.removeValue( keyName, valueName);
		     System.out.println(" after HashMap="+hashMap);
		     System.out.println(" after HashMap size="+hashMap.size());
		     System.out.println(" Run successfully");
		       
		break;
		
		
    	case 16:
		
		      System.out.println("enter the key");
		           keyName= input.next(); 
		      System.out.println("enter the values");
		          valueName= input.next(); 
		        
		        
		     HashMap<String,String>hashMap=obj.replaceValueSame( keyName,valueName);
		     System.out.println(" after HashMap="+hashMap);
		     System.out.println(" after HashMap size="+hashMap.size());
		     System.out.println(" Run successfully");
		              
		break;
		
		case 17:
		      
		     System.out.println("enter the key");
		     keyName= input.next(); 
		     System.out.println("enter the old  value");
	         String  oldValue= input.next(); 
		     System.out.println("enter the new  value");
	         String  newValue= input.next(); 
		          
		        
		     HashMap<String,String>hashMap=obj.replaceValueSome(keyName, oldValue,newValue);
		     System.out.println(" after HashMap="+hashMap);
		     System.out.println(" after HashMap size="+HashMap.size());
		     System.out.println(" Run successfully");
		break;
		
		case 18:
		      
		   
		     HashMap<String,String>hashMap=obj.transferAll ();
		     System.out.println(" after HashMap="+secondMap);
		     System.out.println(" after HashMap size="+secondMap.size());
		     System.out.println(" Run successfully");
		       
		break;
		
		case 19:
		     
	 	     HashMap<String,String>maps=obj.iterateMap();
		     
		break;
	         
	   case 20:
	          
	 	       HashMap<String,String>mapLast=obj.removeEntries (keys,values);
		     
		       System.out.println("after map"+mapLast);
		       System.out.println(" Run successfully");
		break;
	}
  }	
}

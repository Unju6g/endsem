public class Temperaturecheck{
    static void CheckTemprature(int temp){
        if (temp < 0 || temp >100){
            throw new IllegalArgumentException("temprature out of range:"+temp);
        }
            else{
                System.out.println("temprature"+temp+" is within a safe range");
                }
            }
            public static void main(String[] args){
                try{
                    CheckTemprature(23);
                    CheckTemprature(-78);
                }
                catch(IllegalArgumentException e){
                    System.out.println("exception caught : "+ e.getMessage());
                    
                }
                System.out.println("program continuous after handling exception.");
            }
        }
    

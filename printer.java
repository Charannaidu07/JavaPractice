public class printer implements Runnable{
    private String printp;
    private int pnumber;
    public printer(String printp,int pnumber){
        this.printp=printp;
        this.pnumber=pnumber;
    }
    @Override 
    public void run() { 
    for (int i = 1; i <= pnumber; i++)  
    { 
    System.out.println(printp + " prints: " + i); 
    try 
    { 
        Thread.sleep(100); 
    } 
    catch (InterruptedException e)  
    { 
    System.out.println(printp + " was interrupted."); 
    } 
    } 
    } 
}
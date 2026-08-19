class mainpro implements Runnable{
    private String name;
    private int num;
    mainpro(String name,int num){
        this.name=name;
        this.num=num;
    }
    //@Override
    public void run(){
        for(int i=1;i<=num;i++){
            System.out.println(name+": "+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                
            }
        }
    }
}
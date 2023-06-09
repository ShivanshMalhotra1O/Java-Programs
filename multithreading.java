class Morning extends Thread{
    public void run(){
        try{
            int i = 0;
            while(i<5){
                sleep(1000);
                System.out.println("Good Morning");
                i++;
            }
        }
        catch(Exception e){
        }
    }
}

class Hello extends Thread{
    public void run(){
        try{
            int i = 0;
            while(i<5){
                sleep(2000);
                System.out.println("Hello");
                i++;
            }
        }
        catch(Exception e){
        }
    }
}

class Welcome extends Thread{
    public void run(){
        try{
            int i = 0;
            while(i<5){
                sleep(3000);
                System.out.println("Welcome");
                i++;  
            }
        }
        catch(Exception e){
        }
    }
}

class Multithread {
   public static void main(String args[]){
    Morning t1 = new Morning();
    Hello t2 = new Hello();
    Welcome t3 = new Welcome();

    t1.start();
    t2.start();
    t3.start();
   }
}
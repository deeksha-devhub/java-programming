package polymorphism;

public class TV {
    public void switchON(){
        System.out.println("TV switched on");
    }
    public void changeChannel(){
        System.out.println("Tv channel changed");
    }
}

class SmartTV extends TV{
    @Override 
    public void switchON(){
        System.out.println("SmartTV switched on");
    }
    @Override
    public void changeChannel(){
        System.out.println("SmartTv channel changed");
    }

    public void browser(){
        System.out.println("SmartTV browsing");
    }
}

class Overriding{
    public static void main(String[] args){

        TV t = new TV();
        t.switchON();
        t.changeChannel();

        SmartTV st = new SmartTV();
        st.switchON();
        st.changeChannel();

        TV tt = new SmartTV();
        tt.switchON();
        tt.changeChannel();
    }
}



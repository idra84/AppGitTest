import sun.misc.PostVMInitHook;

public class LambaExample1 {

   /* public static void main(String[] args){
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread( runnable);
        thread.run();

    }*/

    /*
    public static void main(String[] args){

        Thread thread = new Thread (new Runnable() {
            public void run() {
                System.out.println("Thread Excecuted");
            }
        });

        thread.run();
    }*/

    //uso de lambda
    //deteccion de la inferencia del return type
   /* public static void main (String[] args){
        Thread t = new Thread(() -> System.out.println("Thread with lambda"));
        t.run();
    }*/

    /*
    public static void main(String [] args){
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("resultado implementacion metodo");
        myFunctionalInterface.myMethod();
    }*/

    //onthe fly implementation
    public static void main(String[] args){

        onTheFly(()-> System.out.println("on the fly implementation"));
    }

    public static void onTheFly(MyFunctionalInterface myFunctionalInterface){
        myFunctionalInterface.myMethod();
    }

}

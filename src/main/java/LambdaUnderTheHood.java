public class LambdaUnderTheHood {

    public static void main (String[] args) {

       /* MyFunctionalInterface myFunctionalInterface2 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                //implementation 1

                System.out.println("implementation 2");
            }
        };
    }

    MyFunctionalInterface myFunctionalInterface2 = new MyFunctionalInterface() {
        @Override
        public void myMethod() {
            System.out.println("implementation 2");
        }
    };

    Estas dos implementaciones generan dos clases anonimas al complocar
    el codigo se vulve complejo en la generacion o en la compilacion al genrar
    el jar file
    */

        //invoke dinamic
        //es un beneficio de lenguajes for estatic type lengaje como java
        // en tiempo de ejecucion sabe que tomar
        // javap -c
        // type onference and invokedynamic
        //
        MyFunctionalInterface myFunctionalInterface = ()-> System.out.println("flygth");
    }

}

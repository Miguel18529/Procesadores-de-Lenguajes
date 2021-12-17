public class Ejemplo2 {

    //Ejemplo de traducción
    public static void main(String args[]){
        Integer a,b,c,d;
        boolean estado_final=false;
        //Estado 1
        a=1; b=6; c=8; d=0;
        System.out.println("Estado 1");
        if (!estado_final && a>=b){
            //Estado 3
            System.out.println("Estado 3");
            if (!estado_final && b>=c){
                //Estado 6
                a=c; c=a; a=d;
                System.out.println("Estado 6");
                estado_final=true;
            }
            if(!estado_final && c>b){
                //estado 7
                System.out.println("Estado 7");
                if(!estado_final && a>c){
                    //Estado 10
                    d=c; c=b; b=d; d=c; c=a; a=b;
                    System.out.println("Estado 10");
                    estado_final=true;
                }
                if(!estado_final && c>=a){
                    //Estado 11
                    d=b; b=a; a=d;
                    System.out.println("Estado 11");
                    estado_final=true;
                }
            }
        }
        if(!estado_final && b>a){
            //Estado 2
            System.out.println("Estado 2");
            if(!estado_final && b>=c){
                //Estado 4
                System.out.println("Estado 4");
                if(!estado_final && a>c){
                    //estado 8
                    d=c; c=a; a=d; d=c; c=b; b=d;
                    System.out.println("Estado 8");
                    estado_final=true;
                }
                if(!estado_final && c>=a){
                    //Estado 9
                    d=c; c=b; b=d;
                    System.out.println("Estado 9");
                    estado_final=true;
                }
            }
            if(!estado_final && c>b){
                //Estado 5
                System.out.println("Estado 5");
                estado_final=true;
            }
        }
    }
}

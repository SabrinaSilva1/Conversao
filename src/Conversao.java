public class Conversao {
    
    public static void main (String args[]) {
        String st, st2;
        float real, real2;
        int int1, int2;

        //String para real
        st = "12";
        real = (float) (new Float(st).floatValue());
        System.out.println("String para real " + real + 10);

        //Real para String
        real2 = 10.50f;
        st2 = new Float(real2).toString();
        System.out.println("Real para String " + st2);

        st2 = "" + real2;
        System.out.println("Real para o string: " + st2);

        //String para inteiro 
        st2 = "13"; //somente se tiver número dentro dos caracteres
        int1 = Integer.parseInt(st2);
        System.out.println("String para inteiro " + int1);

        //Inteiro para string
        int2 = 5;
        st2 = Integer.toString(int2);
        System.out.println("Inteiro para String " + st2);

        st2 = "" + int1;

        Produto.valor1 = 10;
        Produto.valor2 = 20;
        

        Produto p = new Produto();
        System.out.println("Valor 1: " + p.valor1);

        Produto pr = new Produto();
        p.valor3 = 35;
        System.out.println("Valor 1: " + p.valor1);
        System.out.println("Valor 3: " + p.valor3);
        
    } 
}

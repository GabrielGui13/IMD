public class App {

        public static void main(String[] args) {
     
          A a = new A();
     
          B b = new B();
     
          a.meuMetodo(b); 
    
        }

}
class A{

    public void meuMetodo(B b){

         System.out.print("A ");

         E e = new E();

         b.meuMetodo(e);}

}

class B{

    public void meuMetodo(E e){

         System.out.print("B ");

         C c = new C();

         e.meuMetodo(c);}

}

class C {

    public void meuMetodo(D d){

         System.out.print("C ");

         F f = new F();

         d.meuMetodo(f);}

}

class D{

    public void meuMetodo(F f){

         G g = new G();

         System.out.print("D ");

         f.meuMetodo(g);}

}

class E{

    public void meuMetodo(C c){

         System.out.print("E ");

         D d = new D();

         c.meuMetodo(d);}

}

class F{

    public void meuMetodo(G g){

         System.out.print("F ");

         g.meuMetodo();}

}

class G{

    public void meuMetodo(){

         System.out.print("G ");}

}


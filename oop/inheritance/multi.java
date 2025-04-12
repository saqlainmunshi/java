public class multi {
    public static void main(String[] args) {
        bike b = new bike();
       pulsar p = new pulsar();
        ns200 n = new ns200();
        b.tire=2;
        b.headlight=1;
        n.brand="pulsar";
        n.symbol="bajaj";
        n.cc=200;
        n.hp=24;
        n.print();
        // p.print();
    }
}
// multi level inheritance
class bike{
    int tire;
    int headlight ;
    void print(){
    System.out.println(tire);
    System.out.println(headlight);
    }
}

class pulsar  extends bike
{

    String brand;
    String symbol;
    void print(){
        System.out.println(tire);
        System.out.println(headlight);
        System.out.println(brand);
        System.out.println(symbol);
        }
}
class ns200 extends pulsar
{

int cc;
int hp;
void print(){
    System.out.println(tire);
    System.out.println(headlight);
    System.out.println(brand);
    System.out.println(symbol);
    System.out.println(cc);
    System.out.println(hp);
    }

}
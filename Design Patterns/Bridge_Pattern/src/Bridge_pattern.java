public class Bridge_pattern {
    public static void main(String[] args) {
        SubAbstraction s=new SubAbstraction(new SubImplementor());
        s.methord01();
    }
}


abstract class Abstraction{
    implementor implementor;

    public Abstraction(implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void  methord01();
}

class SubAbstraction extends Abstraction{

    public SubAbstraction(implementor implementor) {
        super(implementor);
    }

    @Override
    public void methord01() {
        System.out.println("Sub Abstraction Methord");
        implementor.methord02();
    }

}

interface implementor{
    public abstract void  methord02();
}

class SubImplementor implements implementor{

    @Override
    public void methord02() {
        System.out.println("Sub Implementor methord 02");
    }

}

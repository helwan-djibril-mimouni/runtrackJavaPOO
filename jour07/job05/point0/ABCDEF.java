package jour07.job05.point0;

class ABCDEF {
    public static void main(String[] args) {
        // Indiquez si les affectations suivantes sont correctes:
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        a = b;
        //b = a;
        a = (A) b; a = null;
        //null = a;
        a = d;
        //b = d;
        a = e;
        d = e;
        // Remplissage d'un tableau:
        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        rechercher(as);
        additioner(as);
    }

    private static void rechercher(A[] as){
        
    }

    private static void additioner(A[] as){
        
    }
}

class A {
    public A() { }
}

class B extends A {
    public B() {
        super();
    }
}

class C extends B { 
    public C() { 
        super();
    }
}

class D extends A { 
    protected int d = 1;

    public D(int x) { 
        super();
        d = x;
    }

    public D() {
    }
}

class E extends D { 
    public E() { 
        super();
    }
}

class F extends D { 
    public F() {
        super();
    }
}

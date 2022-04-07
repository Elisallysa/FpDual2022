package ClasesYExcepciones;/* Ejercicio 10
 Create a three-level hierarchy of exceptions. Now create a base-class A with
 a method that throws an exception at the base of your hierarchy. Inherit B
 from A and override the method so it throws an exception at level two of your
 hierarchy. Repeat by inheriting class C from B. In main( ), create a C and
 upcast it to A, then call the method.
*/

public class C extends B {
    
	@Override
    void lanzaExcepcion() throws ExceptionC {
        try {
            super.lanzaExcepcion();
        } catch (ExceptionB eB) {
            eB.printStackTrace();
        }
        System.out.println("C.lanzaExcepcion");
        throw new ExceptionC("Esta es la excepción C.");
    }
	
	public static void main(String[] args) {
        C c = new C();
        try {
            c.lanzaExcepcion();
        } catch (ExceptionC eC) {
            eC.printStackTrace();
        }
    }

}

class A {
    void lanzaExcepcion() throws ExceptionA {
        System.out.println("A.lanzaExcepcion");
        throw new ExceptionA("Esta es la excepción A.");
    }
}

class B extends A {
    @Override
    void lanzaExcepcion() throws ExceptionB {
        try {
            super.lanzaExcepcion();
        } catch (ExceptionA eA) {
            eA.printStackTrace();
        }
        System.out.println("B.lanzaExcepcion");
        throw new ExceptionB("Esta es la excepción B.");
    }
}

class ExceptionA extends Exception {
	public ExceptionA(String message) {
		super(message);
	}
}

class ExceptionB extends ExceptionA {
	public ExceptionB(String message) {
		super(message);
	}
}

class ExceptionC extends ExceptionB {
	public ExceptionC(String message) {
		super(message);
	}
}
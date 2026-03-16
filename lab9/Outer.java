class Outer {

    class Inner {
        void show() {
            System.out.println("This is Inner Class");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}


package demo10.aboutinheritance.example6_13;

// Example 6.13 Using instanceof Operator
interface IStack {                                                // (1)
    void   push(Object item);
    Object pop();
}

class StackImpl implements IStack {                               // (2)
    protected Object[] stackArray;
    protected int      tos;  // top of stack

    public StackImpl(int capacity) {
        stackArray = new Object[capacity];
        tos        = -1;
    }

    public void push(Object item)                                 // (3)
        { stackArray[++tos] = item; }

    public Object pop() {                                         // (4)
        Object objRef = stackArray[tos];
        stackArray[tos] = null;
        tos--;
        return objRef;
    }

    public Object peek() { return stackArray[tos]; }
}

interface ISafeStack extends IStack {                             // (5)
    boolean isEmpty();
    boolean isFull();
}

class SafeStackImpl extends StackImpl implements ISafeStack {     // (6)

    public SafeStackImpl(int capacity) { super(capacity); }
    public boolean isEmpty() { return tos < 0; }                  // (7)
    public boolean isFull() { return tos >= stackArray.length-1; }// (8)
}

public class Identification {
    public static void main(String[] args) {
        Object obj = new Object();
        StackImpl stack = new StackImpl(10);
        SafeStackImpl safeStack = new SafeStackImpl(5);
        IStack iStack;
        System.out.println("(1): " +
            (null instanceof Object));       // Always false.
        System.out.println("(2): " +
            (null instanceof IStack));       // Always false.

        System.out.println("(3): " +         // true: instance of subclass of
            (stack instanceof Object));      //       Object.
        System.out.println("(4): " +
            (obj instanceof StackImpl));     // false: Downcasting.
        System.out.println("(5): " +
            (stack instanceof StackImpl));   // true: instance of StackImpl.

        System.out.println("(6): " +         // false: Object does not implement
             (obj instanceof IStack));       //        IStack.
        System.out.println("(7): " +         // true: SafeStackImpl implements
             (safeStack instanceof IStack)); //       IStack.

        obj = stack;                         // Assigning subclass to superclass.
        System.out.println("(8): " +
            (obj instanceof StackImpl));     // true: instance of StackImpl.
        System.out.println("(9): " +         // true: StackImpl implements
            (obj instanceof IStack));        //       IStack.
        System.out.println("(10): " +
             (obj instanceof String));       // false: No relationship.

        iStack = (IStack) obj; // Cast required: superclass assigned subclass.
        System.out.println("(11): " +        // true: instance of subclass
            (iStack instanceof Object));     //       of Object.
        System.out.println("(12): " +
            (iStack instanceof StackImpl));  // true: instance of StackImpl.

        String[] strArray = new String[10];
    //  System.out.println("(13): " +        // Compile-time error,
    //      (strArray instanceof String);    // no relationship.
        System.out.println("(14): " +
            (strArray instanceof Object));   // true: array subclass of Object.
        System.out.println("(15): " +
            (strArray instanceof Object[])); // true: array subclass of Object[].
        System.out.println("(16): " +
            (strArray[0] instanceof Object));// false: strArray[0] is null.
        strArray[0] = "Amoeba strip";
        System.out.println("(17): " +
            (strArray[0] instanceof String));// true: instance of String.
    }
}

/*
Output from the program:

(1): false
(2): false
(3): true
(4): false
(5): true
(6): false
(7): true
(8): true
(9): true
(10): false
(11): true
(12): true
(14): true
(15): true
(16): false
(17): true
*/

package def.dom;
@jsweet.lang.SyntacticIterable
public class SourceBufferList {
    public double length;
    native public SourceBuffer item(double index);
    native public SourceBuffer $get(double index);
    public static SourceBufferList prototype;
    public SourceBufferList(){}
    /** From Iterable, to allow foreach loop (do not use directly). */
    @jsweet.lang.Erased
    native public java.util.Iterator<SourceBuffer> iterator();
}


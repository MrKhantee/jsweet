package def.dom;

import def.js.StringTypes;
import def.js.StringTypes.enter;
import def.js.StringTypes.exit;

public class TextTrackCue extends EventTarget {
    public double endTime;
    public java.lang.String id;
    public java.util.function.Function<Event,java.lang.Object> onenter;
    public java.util.function.Function<Event,java.lang.Object> onexit;
    public java.lang.Boolean pauseOnExit;
    public double startTime;
    public java.lang.String text;
    public TextTrack track;
    native public DocumentFragment getCueAsHTML();
    native public void addEventListener(def.js.StringTypes.enter type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.exit type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public static TextTrackCue prototype;
    public TextTrackCue(double startTime, double endTime, java.lang.String text){}
    native public void addEventListener(def.js.StringTypes.enter type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.exit type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
    protected TextTrackCue(){}
}


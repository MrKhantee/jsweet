package def.dom;

import def.js.StringTypes;
import def.js.StringTypes.Events;
import def.js.StringTypes.MSGestureChange;
import def.js.StringTypes.MSGestureDoubleTap;
import def.js.StringTypes.MSGestureEnd;
import def.js.StringTypes.MSGestureHold;
import def.js.StringTypes.MSGestureStart;
import def.js.StringTypes.MSGestureTap;
import def.js.StringTypes.MSGotPointerCapture;
import def.js.StringTypes.MSInertiaStart;
import def.js.StringTypes.MSLostPointerCapture;
import def.js.StringTypes.MSPointerCancel;
import def.js.StringTypes.MSPointerDown;
import def.js.StringTypes.MSPointerEnter;
import def.js.StringTypes.MSPointerLeave;
import def.js.StringTypes.MSPointerMove;
import def.js.StringTypes.MSPointerOut;
import def.js.StringTypes.MSPointerOver;
import def.js.StringTypes.MSPointerUp;
import def.js.StringTypes.MouseEvents;
import def.js.StringTypes.MutationEvents;
import def.js.StringTypes.SVGAbort;
import def.js.StringTypes.SVGError;
import def.js.StringTypes.SVGUnload;
import def.js.StringTypes.SVGZoom;
import def.js.StringTypes.SVGZoomEvent;
import def.js.StringTypes.SVGZoomEvents;
import def.js.StringTypes.TransitionEvent;
import def.js.StringTypes.UIEvents;
import def.js.StringTypes.WebGLContextEvent;
import def.js.StringTypes.ariarequest;
import def.js.StringTypes.click;
import def.js.StringTypes.command;
import def.js.StringTypes.dblclick;
import def.js.StringTypes.focusin;
import def.js.StringTypes.focusout;
import def.js.StringTypes.gotpointercapture;
import def.js.StringTypes.load;
import def.js.StringTypes.lostpointercapture;
import def.js.StringTypes.mousedown;
import def.js.StringTypes.mousemove;
import def.js.StringTypes.mouseout;
import def.js.StringTypes.mouseover;
import def.js.StringTypes.mouseup;
import def.js.StringTypes.pointercancel;
import def.js.StringTypes.pointerdown;
import def.js.StringTypes.pointerenter;
import def.js.StringTypes.pointerleave;
import def.js.StringTypes.pointermove;
import def.js.StringTypes.pointerout;
import def.js.StringTypes.pointerover;
import def.js.StringTypes.pointerup;
import def.js.StringTypes.resize;
import def.js.StringTypes.scroll;
import def.js.StringTypes.touchcancel;
import def.js.StringTypes.touchend;
import def.js.StringTypes.touchmove;
import def.js.StringTypes.touchstart;
import def.js.StringTypes.webkitfullscreenchange;
import def.js.StringTypes.webkitfullscreenerror;
import def.js.StringTypes.wheel;

@jsweet.lang.Extends({DocumentEvent.class,SVGLocatable.class,SVGTests.class,SVGStylable.class,SVGLangSpace.class,SVGExternalResourcesRequired.class,SVGFitToViewBox.class,SVGZoomAndPan.class})
public class SVGSVGElement extends SVGElement {
    public java.lang.String contentScriptType;
    public java.lang.String contentStyleType;
    public double currentScale;
    public SVGPoint currentTranslate;
    public SVGAnimatedLength height;
    public java.util.function.Function<Event,java.lang.Object> onabort;
    public java.util.function.Function<Event,java.lang.Object> onerror;
    public java.util.function.Function<UIEvent,java.lang.Object> onresize;
    public java.util.function.Function<UIEvent,java.lang.Object> onscroll;
    public java.util.function.Function<Event,java.lang.Object> onunload;
    public java.util.function.Function<SVGZoomEvent,java.lang.Object> onzoom;
    public double pixelUnitToMillimeterX;
    public double pixelUnitToMillimeterY;
    public double screenPixelToMillimeterX;
    public double screenPixelToMillimeterY;
    public SVGRect viewport;
    public SVGAnimatedLength width;
    public SVGAnimatedLength x;
    public SVGAnimatedLength y;
    native public java.lang.Boolean checkEnclosure(SVGElement element, SVGRect rect);
    native public java.lang.Boolean checkIntersection(SVGElement element, SVGRect rect);
    native public SVGAngle createSVGAngle();
    native public SVGLength createSVGLength();
    native public SVGMatrix createSVGMatrix();
    native public SVGNumber createSVGNumber();
    native public SVGPoint createSVGPoint();
    native public SVGRect createSVGRect();
    native public SVGTransform createSVGTransform();
    native public SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    native public void deselectAll();
    native public void forceRedraw();
    native public CSSStyleDeclaration getComputedStyle(Element elt, java.lang.String pseudoElt);
    native public double getCurrentTime();
    native public Element getElementById(java.lang.String elementId);
    native public NodeList getEnclosureList(SVGRect rect, SVGElement referenceElement);
    native public NodeList getIntersectionList(SVGRect rect, SVGElement referenceElement);
    native public void pauseAnimations();
    native public void setCurrentTime(double seconds);
    native public double suspendRedraw(double maxWaitMilliseconds);
    native public void unpauseAnimations();
    native public void unsuspendRedraw(double suspendHandleID);
    native public void unsuspendRedrawAll();
    native public void addEventListener(def.js.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.SVGAbort type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.SVGError type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.SVGUnload type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.SVGZoom type, java.util.function.Function<SVGZoomEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.click type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.command type, java.util.function.Function<CommandEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.dblclick type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.focusin type, java.util.function.Function<FocusEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.focusout type, java.util.function.Function<FocusEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.load type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.mousedown type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.mousemove type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.mouseout type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.mouseover type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.mouseup type, java.util.function.Function<MouseEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointermove type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointerout type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointerover type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.pointerup type, java.util.function.Function<PointerEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.resize type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.scroll type, java.util.function.Function<UIEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.touchend type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.touchmove type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.touchstart type, java.util.function.Function<TouchEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(def.js.StringTypes.wheel type, java.util.function.Function<WheelEvent,java.lang.Object> listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public static SVGSVGElement prototype;
    public SVGSVGElement(){}
    native public AnimationEvent createEvent(def.js.StringTypes.AnimationEvent eventInterface);
    native public AriaRequestEvent createEvent(def.js.StringTypes.AriaRequestEvent eventInterface);
    native public AudioProcessingEvent createEvent(def.js.StringTypes.AudioProcessingEvent eventInterface);
    native public BeforeUnloadEvent createEvent(def.js.StringTypes.BeforeUnloadEvent eventInterface);
    native public ClipboardEvent createEvent(def.js.StringTypes.ClipboardEvent eventInterface);
    native public CloseEvent createEvent(def.js.StringTypes.CloseEvent eventInterface);
    native public CommandEvent createEvent(def.js.StringTypes.CommandEvent eventInterface);
    native public CompositionEvent createEvent(def.js.StringTypes.CompositionEvent eventInterface);
    native public CustomEvent createEvent(def.js.StringTypes.CustomEvent eventInterface);
    native public DeviceMotionEvent createEvent(def.js.StringTypes.DeviceMotionEvent eventInterface);
    native public DeviceOrientationEvent createEvent(def.js.StringTypes.DeviceOrientationEvent eventInterface);
    native public DragEvent createEvent(def.js.StringTypes.DragEvent eventInterface);
    native public ErrorEvent createEvent(def.js.StringTypes.ErrorEvent eventInterface);
    native public Event createEvent(def.js.StringTypes.Event eventInterface);
    native public Event createEvent(def.js.StringTypes.Events eventInterface);
    native public FocusEvent createEvent(def.js.StringTypes.FocusEvent eventInterface);
    native public GamepadEvent createEvent(def.js.StringTypes.GamepadEvent eventInterface);
    native public HashChangeEvent createEvent(def.js.StringTypes.HashChangeEvent eventInterface);
    native public IDBVersionChangeEvent createEvent(def.js.StringTypes.IDBVersionChangeEvent eventInterface);
    native public KeyboardEvent createEvent(def.js.StringTypes.KeyboardEvent eventInterface);
    native public LongRunningScriptDetectedEvent createEvent(def.js.StringTypes.LongRunningScriptDetectedEvent eventInterface);
    native public MSGestureEvent createEvent(def.js.StringTypes.MSGestureEvent eventInterface);
    native public MSManipulationEvent createEvent(def.js.StringTypes.MSManipulationEvent eventInterface);
    native public MSMediaKeyMessageEvent createEvent(def.js.StringTypes.MSMediaKeyMessageEvent eventInterface);
    native public MSMediaKeyNeededEvent createEvent(def.js.StringTypes.MSMediaKeyNeededEvent eventInterface);
    native public MSPointerEvent createEvent(def.js.StringTypes.MSPointerEvent eventInterface);
    native public MSSiteModeEvent createEvent(def.js.StringTypes.MSSiteModeEvent eventInterface);
    native public MessageEvent createEvent(def.js.StringTypes.MessageEvent eventInterface);
    native public MouseEvent createEvent(def.js.StringTypes.MouseEvent eventInterface);
    native public MouseEvent createEvent(def.js.StringTypes.MouseEvents eventInterface);
    native public MouseWheelEvent createEvent(def.js.StringTypes.MouseWheelEvent eventInterface);
    native public MutationEvent createEvent(def.js.StringTypes.MutationEvent eventInterface);
    native public MutationEvent createEvent(def.js.StringTypes.MutationEvents eventInterface);
    native public NavigationCompletedEvent createEvent(def.js.StringTypes.NavigationCompletedEvent eventInterface);
    native public NavigationEvent createEvent(def.js.StringTypes.NavigationEvent eventInterface);
    native public NavigationEventWithReferrer createEvent(def.js.StringTypes.NavigationEventWithReferrer eventInterface);
    native public OfflineAudioCompletionEvent createEvent(def.js.StringTypes.OfflineAudioCompletionEvent eventInterface);
    native public PageTransitionEvent createEvent(def.js.StringTypes.PageTransitionEvent eventInterface);
    native public PermissionRequestedEvent createEvent(def.js.StringTypes.PermissionRequestedEvent eventInterface);
    native public PointerEvent createEvent(def.js.StringTypes.PointerEvent eventInterface);
    native public PopStateEvent createEvent(def.js.StringTypes.PopStateEvent eventInterface);
    native public ProgressEvent createEvent(def.js.StringTypes.ProgressEvent eventInterface);
    native public SVGZoomEvent createEvent(def.js.StringTypes.SVGZoomEvent eventInterface);
    native public SVGZoomEvent createEvent(def.js.StringTypes.SVGZoomEvents eventInterface);
    native public ScriptNotifyEvent createEvent(def.js.StringTypes.ScriptNotifyEvent eventInterface);
    native public StorageEvent createEvent(def.js.StringTypes.StorageEvent eventInterface);
    native public TextEvent createEvent(def.js.StringTypes.TextEvent eventInterface);
    native public TouchEvent createEvent(def.js.StringTypes.TouchEvent eventInterface);
    native public TrackEvent createEvent(def.js.StringTypes.TrackEvent eventInterface);
    native public TransitionEvent createEvent(def.js.StringTypes.TransitionEvent eventInterface);
    native public UIEvent createEvent(def.js.StringTypes.UIEvent eventInterface);
    native public UIEvent createEvent(def.js.StringTypes.UIEvents eventInterface);
    native public UnviewableContentIdentifiedEvent createEvent(def.js.StringTypes.UnviewableContentIdentifiedEvent eventInterface);
    native public WebGLContextEvent createEvent(def.js.StringTypes.WebGLContextEvent eventInterface);
    native public WheelEvent createEvent(def.js.StringTypes.WheelEvent eventInterface);
    native public Event createEvent(java.lang.String eventInterface);
    public SVGElement farthestViewportElement;
    public SVGElement nearestViewportElement;
    native public SVGRect getBBox();
    native public SVGMatrix getCTM();
    native public SVGMatrix getScreenCTM();
    native public SVGMatrix getTransformToElement(SVGElement element);
    public SVGStringList requiredExtensions;
    public SVGStringList requiredFeatures;
    public SVGStringList systemLanguage;
    native public java.lang.Boolean hasExtension(java.lang.String extension);
    public SVGAnimatedString className;
    public CSSStyleDeclaration style;
    public java.lang.String xmllang;
    public java.lang.String xmlspace;
    public SVGAnimatedBoolean externalResourcesRequired;
    public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
    public SVGAnimatedRect viewBox;
    public static double SVG_ZOOMANDPAN_DISABLE;
    public static double SVG_ZOOMANDPAN_MAGNIFY;
    public static double SVG_ZOOMANDPAN_UNKNOWN;
    native public CSSStyleDeclaration getComputedStyle(Element elt);
    native public void addEventListener(def.js.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.SVGAbort type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.SVGError type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.SVGUnload type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.SVGZoom type, java.util.function.Function<SVGZoomEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.click type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.command type, java.util.function.Function<CommandEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.dblclick type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.focusin type, java.util.function.Function<FocusEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.focusout type, java.util.function.Function<FocusEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.load type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.mousedown type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.mousemove type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.mouseout type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.mouseover type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.mouseup type, java.util.function.Function<MouseEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointermove type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointerout type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointerover type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.pointerup type, java.util.function.Function<PointerEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.resize type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.scroll type, java.util.function.Function<UIEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.touchend type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.touchmove type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.touchstart type, java.util.function.Function<TouchEvent,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,java.lang.Object> listener);
    native public void addEventListener(def.js.StringTypes.wheel type, java.util.function.Function<WheelEvent,java.lang.Object> listener);
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
}


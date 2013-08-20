package org.glydar.api.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Notes methods that handle events inside a listener
 * @author YoshiGenius
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface EventHandler {

    EventPhase phase() default EventPhase.HANDLE;

    EventOrder order() default EventOrder.DEFAULT;

    boolean ignoreCancelled() default false;
}

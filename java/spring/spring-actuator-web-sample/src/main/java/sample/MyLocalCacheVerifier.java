package sample;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyLocalCacheVerifier {

    private final ApplicationEventPublisher eventPublisher;

    public MyLocalCacheVerifier(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
        
    }

    public void checkLocalCache() {
//        try {
//            // ...
//        }
//        catch (CacheCompletelyBrokenException ex) {
//            AvailabilityChangeEvent.publish(this.eventPublisher, ex, LivenessState.BROKEN);
//        }
    }

}
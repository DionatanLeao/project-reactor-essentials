package academy.devdojo.reactive.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@Slf4j
public class FluxTest {
    @Test
    public void fluxSubscriber() {
        Flux<String> fluxString = Flux.just("William", "Suane", "DevDojo", "Academy")
                .log();

        StepVerifier.create(fluxString)
                .expectNext("William", "Suane", "DevDojo", "Academy")
                .verifyComplete();
    }

    @Test
    public void fluxSubscriberNumbers() {
        Flux<Integer> fluxNumber = Flux.range(1, 5)
                .log();

        fluxNumber.subscribe(i -> log.info("Number {}", i));

        log.info("-----------------------------");

        StepVerifier.create(fluxNumber)
                .expectNext(1,2,3,4,5)
                .verifyComplete();
    }
}

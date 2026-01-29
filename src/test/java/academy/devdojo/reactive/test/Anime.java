package academy.devdojo.reactive.test;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Anime {
    private String title;
    private String studio;
    private int episodes;
}

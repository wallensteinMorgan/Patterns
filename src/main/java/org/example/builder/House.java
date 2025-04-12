package org.example.builder;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class House {
    private String roof;
    private String wall;
    private String window;
}

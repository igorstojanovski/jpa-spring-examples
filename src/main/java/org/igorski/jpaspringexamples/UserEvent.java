package org.igorski.jpaspringexamples;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserEvent extends Event {
    private Long userId;
    private int clashing;
}

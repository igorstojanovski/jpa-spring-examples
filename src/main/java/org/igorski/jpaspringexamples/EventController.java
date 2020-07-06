package org.igorski.jpaspringexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping
    public void createSomeEntities() {
        FinancialEvent financialEvent = new FinancialEvent();
        financialEvent.setAmount(BigDecimal.valueOf(1000));
        financialEvent.setClashing("Clashing");
        financialEvent.setDate(new Date());

        UserEvent userEvent = new UserEvent();
        userEvent.setUserId(1L);
        userEvent.setClashing(2);
        userEvent.setDate(new Date());

        eventRepository.save(financialEvent);
        eventRepository.save(userEvent);
    }

}

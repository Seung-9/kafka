package com.ssg.kafka.standard.event;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface HaveEvenName {
    @JsonIgnore
    default String getEventName() {
        return this.getClass().getSimpleName();
    }
}

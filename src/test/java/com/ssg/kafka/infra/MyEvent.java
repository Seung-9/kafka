package com.ssg.kafka.infra;

import com.ssg.kafka.standard.event.HaveEvenName;

public record MyEvent(String msg) implements HaveEvenName {
}
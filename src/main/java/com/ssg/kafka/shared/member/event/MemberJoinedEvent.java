package com.ssg.kafka.shared.member.event;

import com.ssg.kafka.shared.member.dto.MemberDto;
import com.ssg.kafka.standard.event.HaveEvenName;

public record MemberJoinedEvent(
        MemberDto member
) implements HaveEvenName {
}

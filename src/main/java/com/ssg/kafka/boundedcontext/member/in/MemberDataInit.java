package com.ssg.kafka.boundedcontext.member.in;

import com.ssg.kafka.global.event.EventPublisher;
import com.ssg.kafka.shared.member.dto.MemberDto;
import com.ssg.kafka.shared.member.event.MemberJoinedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MemberDataInit {
    private final EventPublisher eventPublisher;

    @Bean
    public ApplicationRunner memberDataInitApplicationRunner() {
        return args -> {
            eventPublisher.publish(
                    new MemberJoinedEvent(
                            new MemberDto(1)
                    )
            );
        };
    }
}
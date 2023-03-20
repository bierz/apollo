package pl.beck.apollo.shared.identity;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDGenerator implements IdGenerator {
    @Override
    public UUID generateId() {
        return UUID.randomUUID();
    }
}

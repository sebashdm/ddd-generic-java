package co.com.sofka.business.repository;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

/**
 * The interface Domain event repository.
 */
public interface DomainEventRepository {
    /**
     * Gets events by.
     *
     * @param aggregateName the aggregate name
     * @param aggregateRootId the aggregate root id
     * @return the events by
     */
    List<DomainEvent> getEventsBy(String aggregateName, String aggregateRootId);
}

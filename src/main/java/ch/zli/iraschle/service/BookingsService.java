package ch.zli.iraschle.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class BookingsService {
    @Inject
    EntityManager entityManager;
}

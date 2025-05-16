package com.leandersonandre.voting.repository;

import com.leandersonandre.voting.model.Vote;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VoteRepository implements PanacheRepository<Vote> {
}

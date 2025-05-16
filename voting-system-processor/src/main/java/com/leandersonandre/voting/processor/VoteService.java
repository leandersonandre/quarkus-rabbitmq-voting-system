package com.leandersonandre.voting.processor;

import com.leandersonandre.voting.model.Vote;
import com.leandersonandre.voting.repository.VoteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class VoteService {


    @Inject
    VoteRepository repository;

    @Transactional
    public void vote(Vote vote) {
        repository.persist(vote);
    }

}

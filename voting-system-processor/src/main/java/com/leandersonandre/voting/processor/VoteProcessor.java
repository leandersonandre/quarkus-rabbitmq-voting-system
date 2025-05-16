package com.leandersonandre.voting.processor;

import com.leandersonandre.voting.model.Vote;
import io.smallrye.common.annotation.Blocking;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class VoteProcessor {

    @Inject
    VoteService service;

    @Incoming("vote")
    @Blocking
    public void process(String request) {
        try {
            var vote = new Vote();
            vote.setCandidate(Long.parseLong(request));
            service.vote(vote);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

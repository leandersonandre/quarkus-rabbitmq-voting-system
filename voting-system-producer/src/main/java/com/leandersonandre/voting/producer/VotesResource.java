package com.leandersonandre.voting.producer;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("api/votes")
public class VotesResource {

    @Channel("vote-request")
    Emitter<String> requestEmitter;

    @POST
    public void createVote(Long candidateId) {
        requestEmitter.send(candidateId.toString());
    }

}

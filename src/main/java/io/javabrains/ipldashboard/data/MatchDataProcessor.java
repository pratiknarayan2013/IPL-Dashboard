package io.javabrains.ipldashboard.data;

import java.time.LocalDate;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.batch.item.ItemProcessor;

import io.javabrains.ipldashboard.model.Match;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

    private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

    @Override
    public Match process(final MatchInput input) throws Exception {
        Match match = new Match();
        match.setId(Long.parseLong(input.getId()));
        match.setCity(input.getCity());
        match.setDate(LocalDate.parse(input.getDate()));
        match.setSeason(input.getSeason());
        match.setMatchNumber(input.getMatchNumber());
        match.setPlayerofMatch(input.getPlayer_of_Match());
        match.setVenue(input.getVenue());

        // Set Team 1 and Team 2 depending on the innings order
        String firstInningTeam, secondInningsTeam;

        if ("bat".equals(input.getTossDecision())) {
            firstInningTeam = input.getTossWinner();
            secondInningsTeam = input.getTossWinner().equals(input.getTeam1())
             ? input.getTeam2() : input.getTeam1();
        } else {
            secondInningsTeam = input.getTossWinner();
            firstInningTeam = input.getTossWinner().equals(input.getTeam1())
            ? input.getTeam2() : input.getTeam1();
        }

        match.setTeam1(firstInningTeam);
        match.setTeam2(secondInningsTeam);
        match.setTossDecision(input.getTossDecision());
        match.setTossWinner(input.getTossWinner());
        match.setWinningTeam(input.getWinningTeam());
        match.setWonBy(input.getWonBy());
        match.setPlayerofMatch(input.getPlayer_of_Match());
        match.setMargin(input.getMargin());
        match.setUmpire1(input.getUmpire1());
        match.setUmpire2(input.getUmpire2());

        log.info(match.getCity());
        return match;
    }
}

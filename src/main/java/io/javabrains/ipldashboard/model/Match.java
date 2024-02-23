package io.javabrains.ipldashboard.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Match {
    
    @Id
    private long id;
    private String city;
    private LocalDate date;
    private String playerofMatch;
    private String season;
    private String matchNumber;
    private String team1;
    private String team2;
    private String venue;
    private String tossWinner;
    private String tossDecision;
    private String superOver;
    private String matchWinner;
    private String WinningTeam;
    private String wonBy;
    private String margin;
    private String umpire1;
    private String umpire2;

    public String getWinningTeam() {
        return WinningTeam;
    }
    public void setWinningTeam(String winningTeam) {
        WinningTeam = winningTeam;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getPlayerofMatch() {
        return playerofMatch;
    }
    public void setPlayerofMatch(String playerofMatch) {
        this.playerofMatch = playerofMatch;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getMatchNumber() {
        return matchNumber;
    }
    public void setMatchNumber(String matchNumber) {
        this.matchNumber = matchNumber;
    }
    public String getTeam1() {
        return team1;
    }
    public void setTeam1(String team1) {
        this.team1 = team1;
    }
    public String getTeam2() {
        return team2;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getTossWinner() {
        return tossWinner;
    }
    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }
    public String getTossDecision() {
        return tossDecision;
    }
    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }
    public String getSuperOver() {
        return superOver;
    }
    public void setSuperOver(String superOver) {
        this.superOver = superOver;
    }
    public String getMatchWinner() {
        return matchWinner;
    }
    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }
    public String getWonBy() {
        return wonBy;
    }
    public void setWonBy(String wonBy) {
        this.wonBy = wonBy;
    }
    public String getMargin() {
        return margin;
    }
    public void setMargin(String margin) {
        this.margin = margin;
    }
    public String getUmpire1() {
        return umpire1;
    }
    public void setUmpire1(String umpire1) {
        this.umpire1 = umpire1;
    }
    public String getUmpire2() {
        return umpire2;
    }
    public void setUmpire2(String umpire2) {
        this.umpire2 = umpire2;
    }    
}

package com.sportmonks.persist.db.entity.fixture;

import com.sportmonks.client.core.data.entity.Fixture;
import com.sportmonks.persist.db.entity.*;
import com.sportmonks.persist.db.entity.fixture.conditions.*;
import com.sportmonks.persist.db.entity.fixture.stats.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "fixture")
@NamedEntityGraph(name = "EFixture.stats",
        attributeNodes = {@NamedAttributeNode("goals"), @NamedAttributeNode("cards")})
public class EFixture {

    @Id
    private Long id;
    @Column
    private Boolean commentaries;
    @Column
    private Integer attendance;
    @Column
    private Boolean winningOddsCalculated;
    @Column
    private Boolean deleted;

    @OneToOne(mappedBy = "fixture")
    private EWeatherReport weatherReport;
    @OneToOne(mappedBy = "fixture")
    private EFixtureFormations formations;
    @OneToOne(mappedBy = "fixture")
    private EFixtureScores scores;
    @OneToOne(mappedBy = "fixture")
    private EFixtureTime time;
    @OneToOne(mappedBy = "fixture")
    private EFixtureCoaches coaches;
    @OneToOne(mappedBy = "fixture")
    private EFixtureStandings standings;

    ///

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "fixture")
    private Set<EGoal> goals;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "fixture")
    private Set<ECard> cards;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "fixture")
    private Set<ECorner> corners;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "fixture")
    private Set<EStats> stats;

//    private FixtureEvents events;

    // // // Dependencies

    @OneToOne
    @JoinColumn(name = "LEAGUE_ID")
    private ELeague league;

    @OneToOne
    @JoinColumn(name = "SEASON_ID")
    private ESeason season;

    @OneToOne
    @JoinColumn(name = "STAGE_ID")
    private EStage stage;

    @OneToOne
    @JoinColumn(name = "ROUND_ID")
    private ERound round;

    @OneToOne
    @JoinColumn(name = "VENUE_ID")
    private EVenue venue;

    @Column
    private Long refereeId;

    @OneToOne
    @JoinColumn(name = "LOCAL_TEAM_ID")
    private ETeam localteam;

    @OneToOne
    @JoinColumn(name = "VISITOR_TEAM_ID")
    private ETeam visitorteam;

    public EFixture() {
    }

    public EFixture(Long id) {
        this.id = id;
    }

    public EFixture(Fixture fixture, ELeague league, ESeason season, EStage stage,
                    ERound round, EVenue venue, ETeam localteam, ETeam visitorteam) {
        this.id = fixture.getId();
        this.commentaries = fixture.getCommentaries();
        this.attendance = fixture.getAttendance();
        this.winningOddsCalculated = fixture.getWinningOddsCalculated();
        this.deleted = fixture.getDeleted();
        this.league = league;
        this.season = season;
        this.stage = stage;
        this.round = round;
        this.venue = venue;
        this.refereeId = fixture.getRefereeId();
        this.localteam = localteam;
        this.visitorteam = visitorteam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(Boolean commentaries) {
        this.commentaries = commentaries;
    }

    public Integer getAttendance() {
        return attendance;
    }

    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    public Boolean getWinningOddsCalculated() {
        return winningOddsCalculated;
    }

    public void setWinningOddsCalculated(Boolean winningOddsCalculated) {
        this.winningOddsCalculated = winningOddsCalculated;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public EWeatherReport getWeatherReport() {
        return weatherReport;
    }

    public void setWeatherReport(EWeatherReport weatherReport) {
        this.weatherReport = weatherReport;
    }

    public EFixtureFormations getFormations() {
        return formations;
    }

    public void setFormations(EFixtureFormations formations) {
        this.formations = formations;
    }

    public EFixtureScores getScores() {
        return scores;
    }

    public void setScores(EFixtureScores scores) {
        this.scores = scores;
    }

    public EFixtureTime getTime() {
        return time;
    }

    public void setTime(EFixtureTime time) {
        this.time = time;
    }

    public EFixtureCoaches getCoaches() {
        return coaches;
    }

    public void setCoaches(EFixtureCoaches coaches) {
        this.coaches = coaches;
    }

    public EFixtureStandings getStandings() {
        return standings;
    }

    public void setStandings(EFixtureStandings standings) {
        this.standings = standings;
    }

    public Set<EGoal> getGoals() {
        return goals;
    }

    public void setGoals(Set<EGoal> goals) {
        this.goals = goals;
    }

    public Set<ECard> getCards() {
        return cards;
    }

    public void setCards(Set<ECard> cards) {
        this.cards = cards;
    }

    public Set<ECorner> getCorners() {
        return corners;
    }

    public void setCorners(Set<ECorner> corners) {
        this.corners = corners;
    }

    public Set<EStats> getStats() {
        return stats;
    }

    public void setStats(Set<EStats> stats) {
        this.stats = stats;
    }

    public ELeague getLeague() {
        return league;
    }

    public void setLeague(ELeague league) {
        this.league = league;
    }

    public ESeason getSeason() {
        return season;
    }

    public void setSeason(ESeason season) {
        this.season = season;
    }

    public EStage getStage() {
        return stage;
    }

    public void setStage(EStage stage) {
        this.stage = stage;
    }

    public ERound getRound() {
        return round;
    }

    public void setRound(ERound round) {
        this.round = round;
    }

    public EVenue getVenue() {
        return venue;
    }

    public void setVenue(EVenue venue) {
        this.venue = venue;
    }

    public Long getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(Long refereeId) {
        this.refereeId = refereeId;
    }

    public ETeam getLocalteam() {
        return localteam;
    }

    public void setLocalteam(ETeam localteam) {
        this.localteam = localteam;
    }

    public ETeam getVisitorteam() {
        return visitorteam;
    }

    public void setVisitorteam(ETeam visitorteam) {
        this.visitorteam = visitorteam;
    }
}

package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sportmonks.client.core.data.structure.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "league_id", "season_id", "stage_id", "round_id", "aggregate_id", "venue_id", "referee_id", "localteam_id", "visitorteam_id",
        "weather_report", "commentaries", "attendance", "winning_odds_calculated", "formations", "scores", "time", "deleted", "localTeam", "visitorTeam",
        "substitutions", "goals", "cards", "other", "lineup", "bench", "stats", "comments", "tvstations", "highlights", "league", "season", "round", "stage",
        "events", "venue"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fixture {

    private Long id;
    @JsonProperty("league_id")
    private Long leagueId;
    @JsonProperty("season_id")
    private Long seasonId;
    @JsonProperty("stage_id")
    private Long stageId;
    @JsonProperty("round_id")
    private Long roundId;
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("aggregate_id")
    private Long aggregateId;
    @JsonProperty("venue_id")
    private Long venueId;
    @JsonProperty("referee_id")
    private Long refereeId;
    @JsonProperty("localteam_id")
    private Long localteamId;
    @JsonProperty("visitorteam_id")
    private Long visitorteamId;
    @JsonProperty("weather_report")
    private WeatherReport weatherReport;
    private Boolean commentaries;
    private Integer attendance;
    @JsonProperty("winning_odds_calculated")
    private Boolean winningOddsCalculated;
    private FixtureFormations formations;
    private FixtureScores scores;
    private FixtureTime time;

    private FixtureStandings standings;
    private FixtureCoaches coaches;

    @JsonProperty
    private Boolean deleted;
    @JsonProperty("localTeam")
    private FixtureTeam localTeam;
    @JsonProperty("visitorTeam")
    private FixtureTeam visitorTeam;
    private FixtureSubstitutions substitutions;

    @JsonProperty
    private FixtureGoals goals;
    private FixtureCards cards;
    private FixtureCorners corners;
    private FixtureOther other;
    private FixtureLineup lineup;
    private FixtureBench bench;
    private Stats stats;
    private Commentaries comments;

    @JsonProperty("tvstations")
    private FixtureTvStations tvstations;
    @JsonProperty("highlights")
    private FixtureHighlights highlights;
    private FixtureLeague league;
    private FixtureSeason season;
    private FixtureRound round;
    private FixtureStage stage;
    private FixtureEvents events;
    private Venue venue;

    public FixtureCorners getCorners() {
        return corners;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setStandings(FixtureStandings standings) {
        this.standings = standings;
    }

    public void setCoaches(FixtureCoaches coaches) {
        this.coaches = coaches;
    }

    public void setCorners(FixtureCorners corners) {
        this.corners = corners;
    }

    @JsonProperty("league_id")
    public Long getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("season_id")
    public Long getSeasonId() {
        return seasonId;
    }

    @JsonProperty("season_id")
    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    @JsonProperty("stage_id")
    public Long getStageId() {
        return stageId;
    }

    @JsonProperty("stage_id")
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    @JsonProperty("round_id")
    public Long getRoundId() {
        return roundId;
    }

    @JsonProperty("round_id")
    public void setRoundId(Long roundId) {
        this.roundId = roundId;
    }

    @JsonProperty("aggregate_id")
    public Long getAggregateId() {
        return aggregateId;
    }

    @JsonProperty("aggregate_id")
    public void setAggregateId(Long aggregateId) {
        this.aggregateId = aggregateId;
    }

    @JsonProperty("venue_id")
    public Long getVenueId() {
        return venueId;
    }

    @JsonProperty("venue_id")
    public void setVenueId(Long venueId) {
        this.venueId = venueId;
    }

    @JsonProperty("referee_id")
    public Long getRefereeId() {
        return refereeId;
    }

    @JsonProperty("referee_id")
    public void setRefereeId(Long refereeId) {
        this.refereeId = refereeId;
    }

    @JsonProperty("localteam_id")
    public Long getLocalteamId() {
        return localteamId;
    }

    @JsonProperty("localteam_id")
    public void setLocalteamId(Long localteamId) {
        this.localteamId = localteamId;
    }

    @JsonProperty("visitorteam_id")
    public Long getVisitorteamId() {
        return visitorteamId;
    }

    @JsonProperty("visitorteam_id")
    public void setVisitorteamId(Long visitorteamId) {
        this.visitorteamId = visitorteamId;
    }

    public FixtureStandings getStandings() {
        return standings;
    }

    public FixtureCoaches getCoaches() {
        return coaches;
    }

    @JsonProperty("weather_report")
    public WeatherReport getWeatherReport() {
        return weatherReport;
    }

    @JsonProperty("weather_report")
    public void setWeatherReport(WeatherReport weatherReport) {
        this.weatherReport = weatherReport;
    }

    @JsonProperty("commentaries")
    public Boolean getCommentaries() {
        return commentaries;
    }

    @JsonProperty("commentaries")
    public void setCommentaries(Boolean commentaries) {
        this.commentaries = commentaries;
    }

    @JsonProperty("attendance")
    public Integer getAttendance() {
        return attendance;
    }

    @JsonProperty("attendance")
    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("winning_odds_calculated")
    public Boolean getWinningOddsCalculated() {
        return winningOddsCalculated;
    }

    @JsonProperty("winning_odds_calculated")
    public void setWinningOddsCalculated(Boolean winningOddsCalculated) {
        this.winningOddsCalculated = winningOddsCalculated;
    }

    @JsonProperty("formations")
    public FixtureFormations getFormations() {
        return formations;
    }

    @JsonProperty("formations")
    public void setFormations(FixtureFormations formations) {
        this.formations = formations;
    }

    @JsonProperty("scores")
    public FixtureScores getScores() {
        return scores;
    }

    @JsonProperty("scores")
    public void setScores(FixtureScores scores) {
        this.scores = scores;
    }

    @JsonProperty("time")
    public FixtureTime getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(FixtureTime time) {
        this.time = time;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("localTeam")
    public FixtureTeam getLocalTeam() {
        return localTeam;
    }

    @JsonProperty("localTeam")
    public void setLocalTeam(FixtureTeam localTeam) {
        this.localTeam = localTeam;
    }

    @JsonProperty("visitorTeam")
    public FixtureTeam getVisitorTeam() {
        return visitorTeam;
    }

    @JsonProperty("visitorTeam")
    public void setVisitorTeam(FixtureTeam visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    @JsonProperty("substitutions")
    public FixtureSubstitutions getSubstitutions() {
        return substitutions;
    }

    @JsonProperty("substitutions")
    public void setSubstitutions(FixtureSubstitutions substitutions) {
        this.substitutions = substitutions;
    }

    @JsonProperty("goals")
    public FixtureGoals getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(FixtureGoals goals) {
        this.goals = goals;
    }

    @JsonProperty("cards")
    public FixtureCards getCards() {
        return cards;
    }

    @JsonProperty("cards")
    public void setCards(FixtureCards cards) {
        this.cards = cards;
    }

    @JsonProperty("other")
    public FixtureOther getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(FixtureOther other) {
        this.other = other;
    }

    @JsonProperty("lineup")
    public FixtureLineup getLineup() {
        return lineup;
    }

    @JsonProperty("lineup")
    public void setLineup(FixtureLineup lineup) {
        this.lineup = lineup;
    }

    @JsonProperty("bench")
    public FixtureBench getBench() {
        return bench;
    }

    @JsonProperty("bench")
    public void setBench(FixtureBench bench) {
        this.bench = bench;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @JsonProperty("comments")
    public Commentaries getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Commentaries comments) {
        this.comments = comments;
    }

    @JsonProperty("tvstations")
    public FixtureTvStations getTvstations() {
        return tvstations;
    }

    @JsonProperty("tvstations")
    public void setTvstations(FixtureTvStations tvstations) {
        this.tvstations = tvstations;
    }

    @JsonProperty("highlights")
    public FixtureHighlights getHighlights() {
        return highlights;
    }

    @JsonProperty("highlights")
    public void setHighlights(FixtureHighlights highlights) {
        this.highlights = highlights;
    }

    @JsonProperty("league")
    public FixtureLeague getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(FixtureLeague league) {
        this.league = league;
    }

    @JsonProperty("season")
    public FixtureSeason getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(FixtureSeason season) {
        this.season = season;
    }

    @JsonProperty("round")
    public FixtureRound getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(FixtureRound round) {
        this.round = round;
    }

    @JsonProperty("stage")
    public FixtureStage getStage() {
        return stage;
    }

    @JsonProperty("stage")
    public void setStage(FixtureStage stage) {
        this.stage = stage;
    }

    @JsonProperty("events")
    public FixtureEvents getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(FixtureEvents events) {
        this.events = events;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
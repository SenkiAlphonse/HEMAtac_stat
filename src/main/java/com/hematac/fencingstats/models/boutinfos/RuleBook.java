package com.hematac.fencingstats.models.boutinfos;

import com.hematac.fencingstats.models.sportentities.Federation;

import javax.persistence.*;

@Entity
@Table(name = "rule_book_types")
public class RuleBook {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne
  @JoinColumn(name="maintainer_federation_id")
  private Federation maintainerFederation;

  private String ruleCreator;
  //ha nem fed, ide lehet kommentelni. később kialakulhat vmi konkrét entitás ami erre jó lehet

  private RuleSystems ruleSystem;

  private RefereeingModel refereeingModel;

  private float startingDistance;

  private float arenaLengthInMetres;

  private float arenaWidthInMetres;

  private ArenaShapes arenaShape;

  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Federation getMaintainerFederation() {
    return maintainerFederation;
  }

  public void setMaintainerFederation(Federation maintainerFederation) {
    this.maintainerFederation = maintainerFederation;
  }

  public String getRuleCreator() {
    return ruleCreator;
  }

  public void setRuleCreator(String ruleCreator) {
    this.ruleCreator = ruleCreator;
  }

  public RuleSystems getRuleSystem() {
    return ruleSystem;
  }

  public void setRuleSystem(RuleSystems ruleSystem) {
    this.ruleSystem = ruleSystem;
  }

  public RefereeingModel getRefereeingModel() {
    return refereeingModel;
  }

  public void setRefereeingModel(RefereeingModel refereeingModel) {
    this.refereeingModel = refereeingModel;
  }

  public float getStartingDistance() {
    return startingDistance;
  }

  public void setStartingDistance(float startingDistance) {
    this.startingDistance = startingDistance;
  }

  public float getArenaLengthInMetres() {
    return arenaLengthInMetres;
  }

  public void setArenaLengthInMetres(float arenaLengthInMetres) {
    this.arenaLengthInMetres = arenaLengthInMetres;
  }

  public float getArenaWidthInMetres() {
    return arenaWidthInMetres;
  }

  public void setArenaWidthInMetres(float arenaWidthInMetres) {
    this.arenaWidthInMetres = arenaWidthInMetres;
  }

  public ArenaShapes getArenaShape() {
    return arenaShape;
  }

  public void setArenaShape(ArenaShapes arenaShape) {
    this.arenaShape = arenaShape;
  }
}

package com.mindfulthinktank.k.language.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import com.mindfulthinktank.boilerplate.annotations.Variety;
import com.mindfulthinktank.boilerplate.annotations.VarietyClass;
import com.mindfulthinktank.boilerplate.annotations.VarietyEnumeration;

@Variety(values = {"Print"})
@VarietyEnumeration
@VarietyClass(name = "${variety}${target.simpleName}Base")
@AllArgsConstructor
public class Statement extends Element {
  @Getter private final StatementKind kind;
}

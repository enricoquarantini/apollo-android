package com.apollographql.apollo.gradle;

import com.apollographql.apollo.compiler.NullableValueType;

import groovy.lang.Closure;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApolloExtension {
  static final String NAME = "apollo";
  private Map<String, String> customTypeMapping = new LinkedHashMap<>();
  private String nullableValueType = NullableValueType.ANNOTATED.getValue();
  private boolean generateAccessors = true;
  private boolean useSemanticNaming = true;
  private boolean generateModelBuilder;

  public Map<String, String> getCustomTypeMapping() {
    return customTypeMapping;
  }

  public void setCustomTypeMapping(Map<String, String> customTypeMapping) {
    this.customTypeMapping = customTypeMapping;
  }

  public String getNullableValueType() {
    return nullableValueType;
  }

  public void setNullableValueType(String nullableValueType) {
    this.nullableValueType = nullableValueType;
  }

  public void setUseSemanticNaming(boolean useSemanticNaming) {
    this.useSemanticNaming = useSemanticNaming;
  }

  public boolean isUseSemanticNaming() {
    return useSemanticNaming;
  }

  public boolean isGenerateAccessors() {
    return generateAccessors;
  }

  public void setGenerateAccessors(boolean generateAccessors) {
    this.generateAccessors = generateAccessors;
  }

  public boolean isGenerateModelBuilder() {
    return generateModelBuilder;
  }

  public void setGenerateModelBuilder(boolean generateModelBuilder) {
    this.generateModelBuilder = generateModelBuilder;
  }

  public void setCustomTypeMapping(Closure closure) {
    closure.setDelegate(customTypeMapping);
    closure.setResolveStrategy(Closure.DELEGATE_FIRST);
    closure.call();
  }
}

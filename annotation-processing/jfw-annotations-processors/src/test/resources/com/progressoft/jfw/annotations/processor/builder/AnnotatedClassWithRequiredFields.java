package com.progressoft.jfw.annotations.processor.builder;

import java.util.List;

import com.progressoft.jfw.annotations.builder.*;

@WithBuilder
public class AnnotatedClassWithRequiredFields {

    @BuilderRequired
    private Integer integerValue;

    @BuilderRequired
    private int intValue;

    private String stringValue;
    private Boolean booleanValue;
    private boolean boolValue;
    private Double doubleValue;
    private double dValue;
    private List<String> stringsList;

    public AnnotatedClassWithRequiredFields(Integer integerValue, int intValue, String stringValue, Boolean booleanValue, boolean boolValue, Double doubleValue, double dValue, List<String> stringsList) {
        this.integerValue = integerValue;
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.booleanValue = booleanValue;
        this.boolValue = boolValue;
        this.doubleValue = doubleValue;
        this.dValue = dValue;
        this.stringsList=stringsList;
    }
}

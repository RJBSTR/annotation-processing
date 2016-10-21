package com.progressoft.annotation.processor.builder;


class AnnotatedClassWithSinglePropertyBuilder {

    private Integer integerValue;

    AnnotatedClassWithSinglePropertyBuilder(){

    }

    AnnotatedClassWithSingleProperty build(){
        return new AnnotatedClassWithSingleProperty(integerValue);
    }

    AnnotatedClassWithSinglePropertyBuilder integerValue(Integer integerValue){
        this.integerValue=integerValue;
        return this;
    }
}

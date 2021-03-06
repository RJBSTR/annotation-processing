package com.progressoft.jfw.annotations.processor.copier;

import com.progressoft.jfw.annotations.processor.copier.AnnotatedClassWithDeepCopyPublicField.AnotherObject;

class AnnotatedClassWithDeepCopyPublicFieldCopier {

    AnnotatedClassWithDeepCopyPublicField copy(AnnotatedClassWithDeepCopyPublicField original) throws CloneNotSupportedException {
        AnnotatedClassWithDeepCopyPublicField result=new AnnotatedClassWithDeepCopyPublicField();

        result.stringValue=original.stringValue;
        result.integerValue=original.integerValue;
        result.doubelValue=original.doubelValue;
        if(java.util.Objects.nonNull(original.anotherObject)) {
            result.anotherObject=original.anotherObject.clone();
        }

        return result;
    }
}
package org.miu.problem2;

public class ThresholdViolationException extends RuntimeException{
    ThresholdViolationException(String msg){
        super(msg);
    }
    ThresholdViolationException(){
        super();
    }
}

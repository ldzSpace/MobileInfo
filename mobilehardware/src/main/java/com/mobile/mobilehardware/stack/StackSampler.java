package com.mobile.mobilehardware.stack;


/**
 * @author guxiaonian
 */
public class StackSampler {

    public static String getStackInfo(Thread thread) {
        StringBuilder stringBuilder = new StringBuilder();

        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            stringBuilder
                    .append(stackTraceElement.toString()).append("\n");
        }
        String result=stringBuilder.toString();
        return result.substring(0,result.length()-1);

    }
}
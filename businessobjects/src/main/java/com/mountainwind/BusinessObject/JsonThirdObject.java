package com.mountainwind.BusinessObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peijie on 19/2/2015.
 */



public class JsonThirdObject {

    private int age = 81;
    private String name = "Michael Caine";
    private List<String> messages;

    public JsonThirdObject() {
        this.messages = new ArrayList<String>() {
            {
                add("You wouldn't hit a man with no trousers..");
                add("At this point, I'd set you up with a..");
                add("You know, your bobby dangler, giggle stick,..");
            }
        };
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Class name: JsonThirdObject\n");
        builder.append("age=");
        builder.append(this.age);
        builder.append("\n");

        builder.append("name=");
        builder.append(this.name);
        builder.append("\n");

        builder.append("messages={\n");
        for(String s: messages) {
            builder.append("\t");
            builder.append(s);
            builder.append("\n");
        }
        builder.append("}");


        return builder.toString();
    }
}

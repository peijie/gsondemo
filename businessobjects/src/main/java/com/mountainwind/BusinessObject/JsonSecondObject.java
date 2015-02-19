package com.mountainwind.BusinessObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peijie on 19/2/2015.
 */
public class JsonSecondObject {
    private int age = 83;
    private String name = "Clint Eastwood";
    private JsonThirdObject jsnTO = new JsonThirdObject();
    private List<String> messages;

    public JsonSecondObject() {
        this.messages = new ArrayList<String>() {
            {
                add("This is the AK-47 assault..");
                add("Are you feeling lucky..");
                add("When a naked man's chasing a..");
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Class name: JsonSecondObject\n");
        builder.append("age=");
        builder.append(this.age);
        builder.append("\n");

        builder.append("name=");
        builder.append(this.name);
        builder.append("\n");

        builder.append("JsonFirstObject=");
        builder.append(jsnTO.toString());
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

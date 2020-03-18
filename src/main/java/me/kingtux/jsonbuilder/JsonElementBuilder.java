package me.kingtux.jsonbuilder;

import com.google.gson.JsonElement;

/**
 * The base of a JsonElement
 */
public interface JsonElementBuilder {
    JsonElement build();

    String buildString();
}

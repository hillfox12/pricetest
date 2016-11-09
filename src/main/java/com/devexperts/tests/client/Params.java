package com.devexperts.tests.client;

import java.util.Collection;

/**
 * @author kasatikov
 */
public interface Params {

    default double get(PricingVariable var) {
        return Double.NaN;
    }

    Collection<PricingVariable> toStringVariables();

    default void appendToString(StringBuilder sb, ParamsKind kind) {
        for (PricingVariable var : toStringVariables()) {
            double value = get(var);
            sb.append(value);
        }
    }
}

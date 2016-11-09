package com.devexperts.tests.client;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @author kasatikov
 */
public interface ProcessParams extends Params {

    double getUnderlying();

    @Override
    default double get(PricingVariable var) {
        return getUnderlying();
    }

    @Override
    default Collection<PricingVariable> toStringVariables() {
        return new LinkedHashSet<>();
    }

    @Override
    default void appendToString(StringBuilder sb, ParamsKind kind) {
        sb.append(',');
        Params.super.appendToString(sb, kind);
    }
}

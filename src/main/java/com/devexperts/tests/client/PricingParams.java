package com.devexperts.tests.client;

/**
 * @author kasatikov
 */
public interface PricingParams extends ProcessParams {

    double getPrice();

    @Override
    default void appendToString(StringBuilder sb, ParamsKind kind) {
        switch (kind) {
            case PRICING:
                sb.append(getPrice());
                break;
            case PROCESS:
                ProcessParams.super.appendToString(sb, ParamsKind.PROCESS);
                break;
        }
    }
}

package com.devexperts.tests.client;

/**
 * @author kasatikov
 */
public class ParamsImpl implements PricingParams {

    @Override
    public double getUnderlying() {
        return 23;
    }

    @Override
    public double getPrice() {
        return 345;
    }
}

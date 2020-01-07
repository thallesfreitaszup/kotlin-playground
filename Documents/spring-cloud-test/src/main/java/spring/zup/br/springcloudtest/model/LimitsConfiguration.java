package spring.zup.br.springcloudtest.model;

import spring.zup.br.springcloudtest.configuration.Configuration;

public class LimitsConfiguration {
    private int minimum;
    private int maximum;

    public LimitsConfiguration(Configuration configuration) {
        this.minimum = configuration.getMinimum();
        this.maximum = configuration.getMaximum();
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}

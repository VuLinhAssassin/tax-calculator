package com.vulinh.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Getter
@Accessors(fluent = true)
public enum TaxRate {
  SOCIAL_INSURANCE(0.08),
  HEALTH_INSURANCE(0.015),
  UNEMPLOYMENT_INSURANCE(0.01);

  private final double rate;
}

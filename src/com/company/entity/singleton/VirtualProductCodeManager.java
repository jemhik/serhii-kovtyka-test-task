package com.company.entity.singleton;

import java.util.Set;

public final class VirtualProductCodeManager {
  private static VirtualProductCodeManager INSTANCE;
  private Set<String> usedCodes;

  public VirtualProductCodeManager(Set<String> usedCodes) {
    this.usedCodes = usedCodes;
  }

  public static VirtualProductCodeManager getInstance(Set<String> usedCodes) {
    if(INSTANCE == null){
      INSTANCE = new VirtualProductCodeManager(usedCodes);
    }
    return INSTANCE;
  }

  public void useCode(String code) {
    usedCodes.add(code);
  }

  public boolean isUsed(String code) {
    return usedCodes.contains(code);
  }
}

package com.carsrace.DRC.interfaces;

import com.carsrace.DRC.Entity.RegisteredUser;

public interface SecureDRC {

    boolean login(RegisteredUser user);

    void logout(RegisteredUser user);
}

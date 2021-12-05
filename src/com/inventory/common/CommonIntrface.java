
package com.inventory.common;

import java.util.List;

public interface CommonIntrface<I> {
    int edit();
    int delete();
    List<I> insert();
}

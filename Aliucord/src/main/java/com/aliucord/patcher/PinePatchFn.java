/*
 * Copyright (c) 2021 Juby210
 * Licensed under the Open Software License version 3.0
 */

package com.aliucord.patcher;

import rx.functions.Action1;
import top.canyie.pine.Pine;
import top.canyie.pine.callback.MethodHook;

public class PinePatchFn extends MethodHook {
    private Action1<Pine.CallFrame> p;

    public PinePatchFn(Action1<Pine.CallFrame> patch) { p = patch; }

    @Override
    public void afterCall(Pine.CallFrame callFrame) { p.call(callFrame); }
}
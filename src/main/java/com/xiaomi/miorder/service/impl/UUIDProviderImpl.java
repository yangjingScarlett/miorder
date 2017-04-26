/*
 * XiaoMi PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.xiaomi.miorder.service.impl;

import java.util.UUID;
import org.springframework.stereotype.Component;
import com.xiaomi.miorder.service.UUIDProvider;

/**
 * @author huangjia
 * @since 1.0
 */
@Component
public class UUIDProviderImpl implements UUIDProvider {
    @Override
    public String get() {
        return UUID.randomUUID().toString();
    }

}

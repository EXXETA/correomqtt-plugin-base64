package com.exxeta.correomqtt.plugin.base64;

import com.exxeta.correomqtt.plugin.spi.DetailViewManipulatorHook;
import com.exxeta.correomqtt.plugin.spi.ExtensionId;
import org.pf4j.Extension;

@Extension
@ExtensionId("encode")
public class Base64ManipulateEncoder implements DetailViewManipulatorHook {

    @Override
    public byte[] manipulate(byte[] bytes) {
        return Base64Utils.encode(bytes);
    }
}

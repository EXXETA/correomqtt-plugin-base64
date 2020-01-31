package com.exxeta.correomqtt.plugin.base64;

import com.exxeta.correomqtt.plugin.spi.DetailViewManipulatorHook;
import com.exxeta.correomqtt.plugin.spi.ExtensionId;
import org.pf4j.Extension;

@Extension
@ExtensionId("decode")
public class Base64ManipulateDecoder implements DetailViewManipulatorHook {

    @Override
    public byte[] manipulate(byte[] selection) {
        return Base64Utils.decode(selection);
    }
}

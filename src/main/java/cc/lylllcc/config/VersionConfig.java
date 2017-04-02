package cc.lylllcc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by lylllcc on 2017/4/2.
 */
@Component
public class VersionConfig {

    @Value("${version.name}")
    public String VERSION_NAME = "";

    @Value("${version.code}")
    public String VERSION_CODE = "";
}

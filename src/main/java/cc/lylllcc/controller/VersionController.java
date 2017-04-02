package cc.lylllcc.controller;

import cc.lylllcc.config.VersionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lylllcc on 2017/4/2.
 */
@RestController
@RequestMapping("/version")
public class VersionController {

    @Autowired
    private VersionConfig versionConfig;

    @GetMapping("/getversion")
    public Object getVersion(){
        Map<String,String> version = new HashMap<>();
        version.put("VERSION_NAME",versionConfig.VERSION_NAME);
        version.put("VERSION_CODE",versionConfig.VERSION_CODE);
        return version;
    }
}

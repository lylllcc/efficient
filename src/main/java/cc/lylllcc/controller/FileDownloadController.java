package cc.lylllcc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lylllcc on 2017/4/2.
 */
@RestController
public class FileDownloadController {

    @RequestMapping("/apk/{filename:.+}")
    public void fileDownload(HttpServletResponse response ,@PathVariable("filename") String filename) throws FileNotFoundException {
        InputStream inStream = new FileInputStream("res/apk/" + filename);
        response.reset();
        response.setContentType("bin");
        response.addHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

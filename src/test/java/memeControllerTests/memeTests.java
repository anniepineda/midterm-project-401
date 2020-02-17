package memeControllerTests;

import io.romellpineda.memestagram.controllers.MemeController;
import io.romellpineda.memestagram.models.ApplicationUser;
import io.romellpineda.memestagram.models.Meme;
import io.romellpineda.memestagram.service.AmazonClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.security.Principal;

public class memeControllerTests {


}


//    @PostMapping("/generator")
//    public RedirectView generateMeme(String linkMeme, String textToAdd, String name, Model m, Principal p) throws IOException {
//        final BufferedImage image = ImageIO.read(new URL(linkMeme));
//        if (image == null) {
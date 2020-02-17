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

class memeControllerTests {

    MemeController meme;
    @BeforeEach
    public void setMemeController(){
        ApplicationUser applicationUser = null;
        AmazonClient amazonClient = null;
        meme = new MemeController(null);
    }

    @Test
    void newControllerUser(){ assertEquals();

    }

    private void assertEquals() {
    }

}




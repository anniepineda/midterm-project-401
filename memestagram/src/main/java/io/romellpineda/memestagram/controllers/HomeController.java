package io.romellpineda.memestagram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Principal p, Model m) {
        if (p != null){
            m.addAttribute("username", p.getName());
        }
        return "index";
    }

    @Controller
    public static class MemeController {

        boolean displayDiv= false;

        @GetMapping("/generator")
        public String getToGenerator(Model m, boolean a) {
            m.addAttribute("displayDiv", a);
            return "generator";
        }

        @PostMapping("/generator")
        public RedirectView generateMeme(String linkMeme, String textToAdd, String name, Model m) throws IOException {
            final BufferedImage image = ImageIO.read(new URL(linkMeme));
            if (image == null) {
                displayDiv=true;
                m.addAttribute("displayDiv", true);
                return new RedirectView("/generator?a=true");
            }
            Graphics g = null;

            if (image != null) {
                g = image.getGraphics();
            }
            g.setFont(g.getFont().deriveFont(30f));
            g.drawString(textToAdd, 100, 100);
            g.dispose();

            try {
                ImageIO.write(image, "png", new File(name+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new RedirectView("/generator");
        }
    }
}

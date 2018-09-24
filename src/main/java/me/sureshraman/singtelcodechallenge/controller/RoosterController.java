package me.sureshraman.singtelcodechallenge.controller;

import me.sureshraman.singtelcodechallenge.model.Rooster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("animals/rooster")
public class RoosterController {
    private final MessageSource messageSource;

    @Autowired
    public RoosterController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @RequestMapping("say")
    public String say(Locale locale) {
        Rooster rooster = new Rooster();
        return messageSource.getMessage(rooster.say(), null, locale);
    }
}

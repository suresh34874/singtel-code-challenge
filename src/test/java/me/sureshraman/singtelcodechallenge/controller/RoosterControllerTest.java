package me.sureshraman.singtelcodechallenge.controller;

import me.sureshraman.singtelcodechallenge.constant.I18nKey;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.MessageSource;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RoosterControllerTest {

    @Mock
    private MessageSource messageSource;

    private RoosterController roosterController;

    @Before
    public void setUp() {
        roosterController = new RoosterController(messageSource);
    }

    @Test
    public void say() {
        String expectedResponse = "rooster response";
        Locale userLocale = Locale.US;
        when(messageSource.getMessage(I18nKey.SAY_ROOSTER, null, userLocale)).thenReturn(expectedResponse);

        String say = roosterController.say(userLocale);

        assertThat(say).isEqualTo(expectedResponse);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import firstpackagejpp.WeatherEvent;
import java.util.Scanner;
import oregontrail.control.GameControl;

/**
 *
 * @author Darrin
 */
public class EventView {

    private String promptCommand;

    private boolean doAction(String weatherChoice) {

        if (weatherChoice.length() < 2) {
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
            return false;
        }

        WeatherEvent weather = GameControl.createWeatherChoice(weatherChoice);

        if (weather == null) {
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
            return false;
        }

        this.displayNextView(weather);

        return true;
    }

    private void displayNextView(WeatherEvent weatherChoice) {

        this.console.println("\n======================================="
                + "\n Your weather event choice is " + weatherChoice.getName()
                + "\n The results of your choice are being calculated"
                + "\n please stand by"
                + "\n========================================"
        );
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

    }

    private String getMenuOption() {

        String value = "S";
        boolean valid = false;

        while (!valid) {
            this.console.println("\n" + this.promptCommand);

            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
                continue;
            }

            break;
        }

        return value;
    }

}

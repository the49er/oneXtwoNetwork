package com.onetwonet.contoller;

import com.onetwonet.service.BetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class FrontController {
    private final BetService betService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void mainBetPage(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect(request.getContextPath() + "bet/list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/bet/list")
    public ModelAndView betPage(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("bets", betService.findAll());
        return modelAndView;
    }

    @GetMapping("/bet/game/{game}")
    public ModelAndView filterGame(@PathVariable("game") String game) {

        ModelAndView modelAndView = new ModelAndView("game");

        modelAndView.addObject("bets", betService.findByGame(game));
        return modelAndView;
    }

    @GetMapping("/bet/client/{clientid}")
    public ModelAndView filterClientId(@PathVariable("clientid") String clientId) {

        ModelAndView modelAndView = new ModelAndView("clientid");
        modelAndView.addObject("bets", betService.findByClientId(clientId));
        return modelAndView;
    }

    @GetMapping("/bet/date/{date}")
    public ModelAndView filterDate(@PathVariable("date") String date) {

        ModelAndView modelAndView = new ModelAndView("date");
        modelAndView.addObject("bets", betService.findByDate(date));
        return modelAndView;
    }
}

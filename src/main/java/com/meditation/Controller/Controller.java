package com.meditation.Controller;

import com.meditation.dao.pressDao;
import com.meditation.pojo.press;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @time:
 * @description:
 */

@RestController
public class Controller {
    @Autowired
    private pressDao pressDao;

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public press hello(@PathVariable String id) {
        press press = pressDao.query_press(id);
        return press;
    }
}
